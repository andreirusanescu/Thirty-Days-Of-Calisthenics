package com.example.thirtytipscalisthenics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtytipscalisthenics.model.Tip
import com.example.thirtytipscalisthenics.model.TipsRepository
import com.example.thirtytipscalisthenics.ui.theme.ThirtyTipsCalisthenicsTheme
import kotlinx.coroutines.launch

val LatoFamily = FontFamily(
    Font(R.font.lato_regular)
)

val OswaldFamily = FontFamily(
    Font(R.font.oswald_regular)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyTipsCalisthenicsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirtyTipsApp()
                }
            }
        }
    }
}

@Composable
fun ThirtyTipsApp() {
    val tips = TipsRepository.tips
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    var feedbackInput by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        },
        floatingActionButton = {
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                FloatingActionButton(
                    onClick = {
                        coroutineScope.launch {
                            listState.animateScrollToItem(0)
                        }
                    },
                    containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.75f),
                    modifier = Modifier.size(40.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Scroll Up"
                    )
                }
                FloatingActionButton(
                    onClick = {
                        coroutineScope.launch {
                            listState.animateScrollToItem(tips.size - 1)
                        }
                    },
                    containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.75f),
                    modifier = Modifier.size(40.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Scroll Down"
                    )
                }
            }
        }

    ) { innerPadding ->

        TipsList(
            tips = tips,
            listState = listState,
            feedbackInput = feedbackInput,
            onFeedbackChange = { feedbackInput = it },
            contentPadding = innerPadding
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Days of Calisthenics",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                fontFamily = OswaldFamily,
            )
        },
        navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.musculous_arm_silhouette_svgrepo_com),
                contentDescription = "Calisthenics Icon",
                tint = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(36.dp)
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.primaryContainer),
        modifier = modifier
    )
}


@Composable
fun TipsList(
    tips: List<Tip>,
    listState: LazyListState,
    feedbackInput: String,
    onFeedbackChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        state = listState,
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        itemsIndexed(items = tips) { index, tip ->

            TipListItem(
                tip = tip,
                index = index,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
        item {
            OutlinedTextField(
                value = feedbackInput,
                onValueChange = onFeedbackChange,
                label = {
                    Text("Leave us some feedback!")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Send
                ),
                keyboardActions = KeyboardActions(
                    onSend = {
                        onFeedbackChange("")
                    }
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
                    .background(MaterialTheme.colorScheme.surfaceContainerLow),
                singleLine = false,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = MaterialTheme.colorScheme.surfaceContainerHighest,
                    unfocusedContainerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                    disabledContainerColor = MaterialTheme.colorScheme.surface,
                )
            )
        }

        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .background(MaterialTheme.colorScheme.surfaceContainerHighest),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Check us out on social media",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 20.dp, top = 12.dp),
                    fontFamily = OswaldFamily
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.linkedin_square_icon),
                        contentDescription = "Linkedin logo",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(44.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable._023_facebook_icon),
                        contentDescription = "Facebook logo",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(44.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.instagram_svgrepo_com),
                        contentDescription = "Instagram logo",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(44.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.youtube_color_svgrepo_com),
                        contentDescription = "YouTube logo",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(44.dp)
                    )
                }
                Text(
                    text = "Copyright © 2025 Andrei Rusanescu. All rights reserved.",
                    style = MaterialTheme.typography.titleSmall,
                    fontFamily = OswaldFamily,
                    modifier = Modifier.padding(top = 20.dp, bottom = 12.dp)
                )
            }

        }
    }
}

@Composable
fun TipListItem(
    tip: Tip,
    index: Int,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 24.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surfaceContainerHigh),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.surfaceDim),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = tip.dayOfTheMonth,
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            Spacer(
                modifier = Modifier.height(8.dp)
            )
            Text(
                text = stringResource(tip.summaryOfGoal),
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            Spacer(
                modifier = Modifier.height(8.dp)
            )

            ImageList(
                imageList = tip.imageRes,
                imageDescriptionList = tip.imageDescription,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .clip(MaterialTheme.shapes.medium)
            )

            ExpandableRow(
                title = stringResource(tip.descriptionTitle),
                content = stringResource(tip.descriptionRes),
                key = index * 10 + 5,
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, top = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            ExpandableRow(
                title = stringResource(tip.nutritionRes),
                content = stringResource(tip.nutritionContentRes),
                key = index * 10,
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            )
        }
    }
}

@Composable
private fun ImageList(
    imageList: List<Int>,
    imageDescriptionList: List<String>,
    modifier: Modifier = Modifier
) {
    var imageIndex by remember { mutableIntStateOf(0) }
    val isFirstImage = imageIndex == 0
    val isLastImage = imageIndex == imageList.size - 1

    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = imageList[imageIndex]),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Text(
            text = imageDescriptionList[imageIndex],
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(2f, 2f),
                    blurRadius = 4f
                )
            ),
            modifier = Modifier
                .padding(12.dp)
                .background(
                    color = Color.Gray.copy(alpha = 0.3f),
                    shape = RoundedCornerShape(8.dp)
                )
        )

        IconButton(
            onClick = { imageIndex-- },
            enabled = !isFirstImage,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 4.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                contentDescription = "Previous Image",
                tint = if (isFirstImage) Color.DarkGray.copy(alpha = 0.3f) else Color.DarkGray
            )
        }

        IconButton(
            onClick = { imageIndex++ },
            enabled = !isLastImage,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 4.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "Next Image",
                tint = if (isLastImage) Color.DarkGray.copy(alpha = 0.3f) else Color.DarkGray
            )
        }
    }
}

@Composable
private fun ExpandableRow(
    title: String,
    content: String,
    key: Int,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }


    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontFamily = LatoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                /**
                 * Not magic numbers,
                 * 29 is the index of the last day,
                 * and 5 is just a flag to make the icon
                 * appear only for the first expandable on the
                 * last card.
                 */
                if (key / 10 == 29 && key % 10 == 5) {
                    Icon(
                        painter = painterResource(R.drawable.sport_recognition_ribbon_badge_svgrepo_com),
                        contentDescription = "Trophy",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }

            IconButton(
                onClick = { expanded = !expanded }
            ) {
                Icon(
                    imageVector = if (expanded) {
                        Icons.Filled.KeyboardArrowUp
                    } else {
                        Icons.Filled.KeyboardArrowDown
                    },
                    contentDescription = if (expanded) {
                        "Collapse"
                    } else {
                        "Expand"
                    },
                    tint = MaterialTheme.colorScheme.secondary
                )
            }
        }

        AnimatedVisibility(visible = expanded) {
            Column {
                val lines = content.split("\n").filter { it.isNotBlank() }
                lines.forEach { line ->
                    val trimmedLine = line.trim()
                    if (trimmedLine.startsWith("• ")) {
                        Text(
                            text = trimmedLine,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(start = 16.dp, bottom = 4.dp),
                            fontFamily = LatoFamily
                        )
                    } else {
                        Text(
                            text = trimmedLine,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(top = 8.dp),
                            fontFamily = LatoFamily
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ThirtyTipsCalisthenicsTheme(darkTheme = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ThirtyTipsApp()
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun CardPreview() {
//    TipListItem(
//        tip = TipsRepository.tips[0],
//        index = 0,
//        modifier = Modifier
//            .padding(horizontal = 16.dp, vertical = 8.dp)
//    )
//}
