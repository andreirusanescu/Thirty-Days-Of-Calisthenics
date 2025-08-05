package com.example.thirtytipscalisthenics.model
import com.example.thirtytipscalisthenics.R
object TipsRepository {
    val tips = listOf(
        Tip(
            dayOfTheMonth = "Day 1",
            summaryOfGoal = R.string.tip1,
            descriptionRes = R.string.description1,
            imageRes = listOf(R.drawable.push1, R.drawable.push2, R.drawable.air_squats, R.drawable.crunches),
            descriptionTitle = R.string.description_title1,
            nutritionRes = R.string.nutrition1,
            nutritionContentRes = R.string.nutrition_description1,
            imageDescription = listOf("Push-up 1/2", "Push-up 2/2", "Air-squats", "Crunches")
        ),
       Tip(
            dayOfTheMonth = "Day 2",
            summaryOfGoal = R.string.tip2,
            descriptionRes = R.string.description2,
            descriptionTitle = R.string.description_title2,
            nutritionRes = R.string.nutrition2,
            nutritionContentRes = R.string.nutrition_description2,
            imageRes = listOf(R.drawable.plank, R.drawable.leg_raises1, R.drawable.leg_raises2, R.drawable.russian_twists1),
            imageDescription = listOf("Plank", "Leg raises 1/2", "Leg raises 2/2", "Russian twists")
       ),
        Tip(
            dayOfTheMonth = "Day 3",
            summaryOfGoal = R.string.tip3,
            descriptionRes = R.string.description3,
            descriptionTitle = R.string.description_title3,
            nutritionRes = R.string.nutrition3,
            nutritionContentRes = R.string.nutrition_description3,
            imageRes = listOf(R.drawable.air_squats, R.drawable.lunges, R.drawable.calf_raises),
            imageDescription = listOf("Squats", "Lunges", "Calf raises")
        ),

        Tip(
            dayOfTheMonth = "Day 4",
            summaryOfGoal = R.string.tip4,
            descriptionRes = R.string.description4,
            descriptionTitle = R.string.description_title4,
            nutritionRes = R.string.nutrition4,
            nutritionContentRes = R.string.nutrition_description4,
            imageRes = listOf(R.drawable.incline_pushups, R.drawable.tricep_dips, R.drawable.diamond),
            imageDescription = listOf("Incline push-ups", "Triceps dips", "Diamond push-ups")
        ),
        Tip(
            dayOfTheMonth = "Day 5",
            summaryOfGoal = R.string.tip5,
            descriptionRes = R.string.description5,
            descriptionTitle = R.string.description_title5,
            nutritionRes = R.string.nutrition5,
            nutritionContentRes = R.string.nutrition_description5,
            imageRes = listOf(R.drawable.walk),
            imageDescription = listOf("")
        ),

        Tip(
            dayOfTheMonth = "Day 6",
            summaryOfGoal = R.string.tip6,
            descriptionRes = R.string.description6,
            descriptionTitle = R.string.description_title6,
            nutritionRes = R.string.nutrition6,
            nutritionContentRes = R.string.nutrition_description6,
            imageRes = listOf(R.drawable.pull_ups, R.drawable.chinups, R.drawable.dead_hang),
            imageDescription = listOf("Pull-ups", "Chin-ups", "Dead hang")
        ),

        Tip(
            dayOfTheMonth = "Day 7",
            summaryOfGoal = R.string.tip7,
            descriptionRes = R.string.description7,
            descriptionTitle = R.string.description_title7,
            nutritionRes = R.string.nutrition7,
            nutritionContentRes = R.string.nutrition_description7,
            imageRes = listOf(R.drawable.crunches, R.drawable.leg_raises1, R.drawable.leg_raises2, R.drawable.plank),
            imageDescription = listOf("Crunches", "Leg raises 1/2", "Leg raises 2/2", "Plank")
        ),

        Tip(
            dayOfTheMonth = "Day 8",
            summaryOfGoal = R.string.tip8,
            descriptionRes = R.string.description8,
            descriptionTitle = R.string.description_title8,
            nutritionRes = R.string.nutrition8,
            nutritionContentRes = R.string.nutrition_description8,
            imageRes = listOf(R.drawable.jump_squats, R.drawable.lunges, R.drawable.wall_sits),
            imageDescription = listOf("Jump squats", "Lunges", "Wall sits")
        ),
        Tip(
            dayOfTheMonth = "Day 9",
            summaryOfGoal = R.string.tip9,
            descriptionRes = R.string.description9,
            descriptionTitle = R.string.description_title9,
            nutritionRes = R.string.nutrition9,
            nutritionContentRes = R.string.nutrition_description9,
            imageRes = listOf(R.drawable.wide_pushups, R.drawable.diamond, R.drawable.archer_pushups),
            imageDescription = listOf("Wide push-ups", "Diamond push-ups", "Archer push-ups")
        ),

        Tip(
            dayOfTheMonth = "Day 10",
            summaryOfGoal = R.string.tip10,
            descriptionRes = R.string.description10,
            descriptionTitle = R.string.description_title10,
            nutritionRes = R.string.nutrition10,
            nutritionContentRes = R.string.nutrition_description10,
            imageRes = listOf(R.drawable.swim),
            imageDescription = listOf("")
        ),

        Tip(
            dayOfTheMonth = "Day 11",
            summaryOfGoal = R.string.tip11,
            descriptionRes = R.string.description11,
            descriptionTitle = R.string.description_title11,
            nutritionRes = R.string.nutrition11,
            nutritionContentRes = R.string.nutrition_description11,
            imageRes = listOf(R.drawable.bulgarian, R.drawable.air_squats, R.drawable.side_plank),
            imageDescription = listOf("Bulgarian split squats", "Squats", "Side plank")
        ),

        Tip(
            dayOfTheMonth = "Day 12",
            summaryOfGoal = R.string.tip12,
            descriptionRes = R.string.description12,
            descriptionTitle = R.string.description_title12,
            nutritionRes = R.string.nutrition12,
            nutritionContentRes = R.string.nutrition_description12,
            imageRes = listOf(R.drawable.pull_ups, R.drawable.chinups, R.drawable.inverted_rows),
            imageDescription = listOf("Push-ups", "Chin-ups", "Inverted rows")
        ),
        Tip(
            dayOfTheMonth = "Day 13",
            summaryOfGoal = R.string.tip13,
            descriptionRes = R.string.description13,
            descriptionTitle = R.string.description_title13,
            nutritionRes = R.string.nutrition13,
            nutritionContentRes = R.string.nutrition_description13,
            imageRes = listOf(R.drawable.plank, R.drawable.wall_sits, R.drawable.hollow_hold),
            imageDescription = listOf("Plank", "Wall sits", "Hollow hold")
        ),
        Tip(
            dayOfTheMonth = "Day 14",
            summaryOfGoal = R.string.tip14,
            descriptionRes = R.string.description14,
            descriptionTitle = R.string.description_title14,
            nutritionRes = R.string.nutrition14,
            nutritionContentRes = R.string.nutrition_description14,
            imageRes = listOf(R.drawable.jog),
            imageDescription = listOf("")
        ),
        Tip(
            dayOfTheMonth = "Day 15",
            summaryOfGoal = R.string.tip15,
            descriptionRes = R.string.description15,
            descriptionTitle = R.string.description_title15,
            nutritionRes = R.string.nutrition15,
            nutritionContentRes = R.string.nutrition_description15,
            imageRes = listOf(R.drawable.clapping_pushups, R.drawable.incline_pushups, R.drawable.archer_pushups),
            imageDescription = listOf("Clapping push-ups", "Incline push-ups", "Archer push-ups")
        ),
        Tip(
            dayOfTheMonth = "Day 16",
            summaryOfGoal = R.string.tip16,
            descriptionRes = R.string.description16,
            descriptionTitle = R.string.description_title16,
            nutritionRes = R.string.nutrition16,
            nutritionContentRes = R.string.nutrition_description16,
            imageRes = listOf(R.drawable.bicycle_crunches, R.drawable.leg_raises1, R.drawable.leg_raises2, R.drawable.hollow_hold),
            imageDescription = listOf("Bicycle crunches", "Leg raises 1/2", "Leg raises 2/2", "Hollow hold")
        ),
        Tip(
            dayOfTheMonth = "Day 17",
            summaryOfGoal = R.string.tip17,
            descriptionRes = R.string.description17,
            descriptionTitle = R.string.description_title17,
            nutritionRes = R.string.nutrition17,
            nutritionContentRes = R.string.nutrition_description17,
            imageRes = listOf(R.drawable.lunges, R.drawable.jump_squats, R.drawable.wall_sits),
            imageDescription = listOf("Walking lunges", "Jump squats", "Wall sits")
        ),

        Tip(
            dayOfTheMonth = "Day 18",
            summaryOfGoal = R.string.tip18,
            descriptionRes = R.string.description18,
            descriptionTitle = R.string.description_title18,
            nutritionRes = R.string.nutrition18,
            nutritionContentRes = R.string.nutrition_description18,
            imageRes = listOf(R.drawable.inverted_rows, R.drawable.dead_hang),
            imageDescription = listOf("Inverted rows", "Dead hang")
        ),

        Tip(
            dayOfTheMonth = "Day 19",
            summaryOfGoal = R.string.tip19,
            descriptionRes = R.string.description19,
            descriptionTitle = R.string.description_title19,
            nutritionRes = R.string.nutrition19,
            nutritionContentRes = R.string.nutrition_description19,
            imageRes = listOf(R.drawable.yoga),
            imageDescription = listOf("")

        ),
        Tip(
            dayOfTheMonth = "Day 20",
            summaryOfGoal = R.string.tip20,
            descriptionRes = R.string.description20,
            descriptionTitle = R.string.description_title20,
            nutritionRes = R.string.nutrition20,
            nutritionContentRes = R.string.nutrition_description20,
            imageRes = listOf(R.drawable.push1, R.drawable.push2, R.drawable.tricep_dips, R.drawable.diamond),
            imageDescription = listOf("Max push-ups 2 min", "Max push-ups 2 min", "Max dips 2 min", "Max diamond push-ups\n2min")
        ),

        Tip(
            dayOfTheMonth = "Day 21",
            summaryOfGoal = R.string.tip21,
            descriptionRes = R.string.description21,
            descriptionTitle = R.string.description_title21,
            nutritionRes = R.string.nutrition21,
            nutritionContentRes = R.string.nutrition_description21,
            imageRes = listOf(R.drawable.crunches, R.drawable.leg_raises1, R.drawable.leg_raises2, R.drawable.plank),
            imageDescription = listOf("Crunches", "Leg raises 1/2", "Leg raises 2/2", "Max plank\n3 times")
        ),

        Tip(
            dayOfTheMonth = "Day 22",
            summaryOfGoal = R.string.tip22,
            descriptionRes = R.string.description22,
            descriptionTitle = R.string.description_title22,
            nutritionRes = R.string.nutrition22,
            nutritionContentRes = R.string.nutrition_description22,
            imageRes = listOf(R.drawable.air_squats, R.drawable.lunges, R.drawable.calf_raises),
            imageDescription = listOf("Squats", "Lunges", "Calf raises")
        ),

        Tip(
            dayOfTheMonth = "Day 23",
            summaryOfGoal = R.string.tip23,
            descriptionRes = R.string.description23,
            descriptionTitle = R.string.description_title23,
            nutritionRes = R.string.nutrition23,
            nutritionContentRes = R.string.nutrition_description23,
            imageRes = listOf(R.drawable.pull_ups, R.drawable.inverted_rows, R.drawable.chinups),
            imageDescription = listOf("Pull ups", "Inverted rows", "Chin ups")
        ),

        Tip(
            dayOfTheMonth = "Day 24",
            summaryOfGoal = R.string.tip24,
            descriptionRes = R.string.description24,
            descriptionTitle = R.string.description_title24,
            nutritionRes = R.string.nutrition24,
            nutritionContentRes = R.string.nutrition_description24,
            imageRes = listOf(R.drawable.wall_sits, R.drawable.plank, R.drawable.side_plank),
            imageDescription = listOf("Wall sits", "Plank", "Side plank")
        ),

        Tip(
            dayOfTheMonth = "Day 25",
            summaryOfGoal = R.string.tip25,
            descriptionRes = R.string.description25,
            descriptionTitle = R.string.description_title25,
            nutritionRes = R.string.nutrition25,
            nutritionContentRes = R.string.nutrition_description25,
            imageRes = listOf(R.drawable.jump_squats, R.drawable.push1,
                              R.drawable.push2, R.drawable.crunches, R.drawable.plank),
            imageDescription = listOf("Jump squats", "Push-ups 1/2", "Push-ups 2/2",
                                      "Crunches", "Plank")
        ),

        Tip(
            dayOfTheMonth = "Day 26",
            summaryOfGoal = R.string.tip26,
            descriptionRes = R.string.description26,
            descriptionTitle = R.string.description_title26,
            nutritionRes = R.string.nutrition26,
            nutritionContentRes = R.string.nutrition_description26,
            imageRes = listOf(R.drawable.hollow_hold, R.drawable.side_plank, R.drawable.plank),
            imageDescription = listOf("Hollow hold", "Side plank", "Plank")
        ),
        Tip(
            dayOfTheMonth = "Day 27",
            summaryOfGoal = R.string.tip27,
            descriptionRes = R.string.description27,
            descriptionTitle = R.string.description_title27,
            nutritionRes = R.string.nutrition27,
            nutritionContentRes = R.string.nutrition_description27,
            imageRes = listOf(R.drawable.air_squats, R.drawable.bulgarian, R.drawable.calf_raises),
            imageDescription = listOf("Squats", "Bulgarian squats", "Calf raises")
        ),

        Tip(
            dayOfTheMonth = "Day 28",
            summaryOfGoal = R.string.tip28,
            descriptionRes = R.string.description28,
            descriptionTitle = R.string.description_title28,
            nutritionRes = R.string.nutrition28,
            nutritionContentRes = R.string.nutrition_description28,
            imageRes = listOf(R.drawable.push1, R.drawable.push2, R.drawable.pull_ups, R.drawable.tricep_dips),
            imageDescription = listOf("Push-ups 1/2", "Push-ups 2/2", "Pull-ups", "Dips")
        ),

        Tip(
            dayOfTheMonth = "Day 29",
            summaryOfGoal = R.string.tip29,
            descriptionRes = R.string.description29,
            descriptionTitle = R.string.description_title29,
            nutritionRes = R.string.nutrition29,
            nutritionContentRes = R.string.nutrition_description29,
            imageRes = listOf(R.drawable.forest),
            imageDescription = listOf("")
        ),

        Tip(
            dayOfTheMonth = "Day 30",
            summaryOfGoal = R.string.tip30,
            descriptionRes = R.string.description30,
            descriptionTitle = R.string.description_title30,
            nutritionRes = R.string.nutrition30,
            nutritionContentRes = R.string.nutrition_description30,
            imageRes = listOf(R.drawable.push1, R.drawable.push2, R.drawable.air_squats, R.drawable.pull_ups, R.drawable.plank),
            imageDescription = listOf("Push-ups 1/2", "Push-ups 2/2", "Squats", "Pull-ups", "Plank")
        )
    )
}