package com.example.mamaquizapp.data.model

object PrepopulateDatabase {

    val listOfQuestions = commitQuestionData()
    val listOfAnswers = commitAnswerData()


    private fun commitQuestionData(): List<Questions> {

        return listOf(

            Questions(
                1,
                "با توجه به اینکه ایشان در فاز نهفته لیبر هستند، نبایستی بستری شوند.",
                1,
                false
            ),
            Questions(
                2,
                "بایستی تمامی مراقبتها فقط توسط یک ماما، در طول مراحل مختلف لیبر، زایمان و پس از زایمان ارائه گردد.",
                1,
                false
            ),
            Questions(
                3,
                "تحت هر شرایطی، تمامی حقوق زن باردار (حریم خصوصی، استقلال و مشارکت در تصمیم¬گیری) بایستی توسط تیم مراقبتی رعایت شود.",
                1,
                false
            ),
            Questions(
                4,
                "با توجه به موانع فرهنگی و فرصت ناکافی برای ایجاد صمیمت بین زن و مراقب، مراقب بهتر است زن را با اسمش خطاب نکند و از عنوان خانم استفاده نماید.",
                1,
                false
            ),
            Questions(
                5,
                "در صورت تسلط زن و خانواده ی وی به زبان رسمی کشور، مراقب بهتر است اطلاعات مورد نیاز را به این زبان به ایشان ارائه و توضیح دهد.",
                1,
                false
            ),
            Questions(
                6,
                "در صورتی که زن تمایلی به داشتن همراه در لیبر نداشته باشد، مراقب بهتر است وی را از مزایای داشتن همراه و دریافت حمایت بیشتر در صورت داشتن همراه، آگاه و ترغیب نماید.",
                1,
                false
            ),
            Questions(
                7,
                "مراقب بایستی به زن اطلاعات کافی در مورد تعریف فاز نهفته را ارائه نماید.",
                1,
                false
            ),
            Questions(
                8,
                "مراقب بایستی زن باردار را از مکانیسم¬های موجود برای رسیدگی به شکایات مطلع نماید.",
                1,
                false
            ),
            Questions(
                9,
                "مراقب بهتر است حین برقراری ارتباط با زن، بجای استفاده از اصطلاحات عامیانه از اصطلاحات علمی و تخصصی استفاده نماید.",
                1,
                false
            ),
            Questions(
                10,
                "با توجه به موانع فرهنگی، بهتر است به زن توصیه نمود که بجای همسر یکی از خویشاوندان همجنس خود را به عنوان همراه انتخاب نماید.",
                1,
                false
            ),

            //question type 2
            Questions(
                11,
                "زن بایستی مطلع شود که حداکثر تا 12 ساعت وارد فاز فعال لیبر خواهد شد.",
                2,
                false
            ),
            Questions(
                12,
                "پلویمتری بالینی (سایز و شکل لگن) در پذیرش لیبر صورت گیرد.",
                2,
                false
            ),
            Questions(
                13,
                "کاردیوتوکوگرافی برای ارزیابی سلامت جنین انجام گیرد.",
                2,
                false
            ),
            Questions(
                14,
                "سمع قلب جنین برای ارزیابی سلامت جنین انجام گیرد.",
                2,
                false
            ),
            Questions(
                15,
                "اصلاح موهای پرینه یا پوبیس انجام گیرد.",
                2,
                false
            ),
            Questions(
                16,
                "برای کاهش استفاده از تقویت لیبر (Agumentation) انما انجام گیرد.",
                2,
                false
            ),

            //question type 3
            Questions(
                17,
                "مراقب بایستی زن را از میزان پیشرفت فاز فعال مطلع نماید و در صورت میزان دیلاتاسیون کمتر از 1 سانتی¬متر در ساعت، بررسی¬های بیشتر انجام دهد.",
                3,
                false
            ),
            Questions(
                18,
                "معاینه واژینال در فواصل هر 2 ساعت برای ارزیابی میزان پیشرفت فاز فعال لیبر انجام گیرد.",
                3,
                false
            ),
            Questions(
                19,
                "به صورت متناوب، ضربان قلب جنین سمع شود.",
                3,
                false
            ),
            Questions(
                20,
                "در صورت درخواست و رضایت مادر، آنالژزی اپیدورال توسط تکنسین ماهر زیر نظر متخصص بیهوشی انجام شود.",
                3,
                false
            ),
            Questions(
                21,
                "حدالمقدور از پتيدين جهت تسکین لیبر استفاده نشود.",
                3,
                false
            ),
            Questions(
                22,
                "تکنیک¬های دستی مانند ماساژ و یا استفاده از کیسه گرم، اثربخشی پائین دارند.",
                3,
                false
            ),
            Questions(
                23,
                "تسکین درد برای جلوگیری از تاخیر لیبر و کاهش استفاده از تقویت لیبر انجام گیرد.",
                3,
                false
            ),
            Questions(
                24,
                "به منظور جلوگیری از آسپیراسیون در صورت احتمال سزارین اورژانسی، دریافت غذاهای جامد در طول لیبر منع شود.",
                3,
                false
            ),
            Questions(
                25,
                "برای جلوگیری از تاخیر لیبر و تشخیص مکونیوم احتمالی، آمنیوتومی انجام گردد.",
                3,
                false
            ),
            Questions(
                26,
                "بهتر است برای کوتاه کردن طول مدت لیبر و دهیدراتاسیون مادر، از مایعات داخل وریدی (سرم) استفاده شود.",
                3,
                false
            )

        )
    }

    private fun commitAnswerData(): List<Answers> {


        return listOf(
            //answer type 1

            Answers(1, 1, false, "توصیه می شود"),
            Answers(2, 1, false, "توصیه نمی شود"),
            Answers(3, 1, true, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(4, 2, false, "توصیه می شود"),
            Answers(5, 2, false, "توصیه نمی شود"),
            Answers(6, 2, true, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(7, 3, true, "توصیه می شود"),
            Answers(8, 3, false, "توصیه نمی شود"),
            Answers(9, 3, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(10, 4, false, "توصیه می شود"),
            Answers(11, 4, true, "توصیه نمی شود"),
            Answers(12, 4, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(13, 5, false, "توصیه می شود"),
            Answers(14, 5, true, "توصیه نمی شود"),
            Answers(15, 5, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(16, 6, false, "توصیه می شود"),
            Answers(17, 6, true, "توصیه نمی شود"),
            Answers(18, 6, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(19, 7, true, "توصیه می شود"),
            Answers(20, 7, false, "توصیه نمی شود"),
            Answers(21, 7, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(22, 8, true, "توصیه می شود"),
            Answers(23, 8, false, "توصیه نمی شود"),
            Answers(24, 8, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(25, 9, false, "توصیه می شود"),
            Answers(26, 9, true, "توصیه نمی شود"),
            Answers(27, 9, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(28, 10, true, "توصیه می شود"),
            Answers(29, 10, false, "توصیه نمی شود"),
            Answers(30, 10, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            //answer type 2
            Answers(31, 11, false, "توصیه می شود"),
            Answers(32, 11, true, "توصیه نمی شود"),
            Answers(33, 11, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(34, 12, false, "توصیه می شود"),
            Answers(35, 12, true, "توصیه نمی شود"),
            Answers(36, 12, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(46, 13, false, "توصیه می شود"),
            Answers(47, 13, true, "توصیه نمی شود"),
            Answers(48, 13, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(37, 14, true, "توصیه می شود"),
            Answers(38, 14, false, "توصیه نمی شود"),
            Answers(39, 14, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(40, 15, false, "توصیه می شود"),
            Answers(41, 15, true, "توصیه نمی شود"),
            Answers(42, 15, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(43, 16, false, "توصیه می شود"),
            Answers(44, 16, true, "توصیه نمی شود"),
            Answers(45, 16, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),



            //question type 3
            Answers(76, 17, false, "توصیه می شود"),
            Answers(77, 17, true, "توصیه نمی شود"),
            Answers(78, 17, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(49, 18, false, "توصیه می شود"),
            Answers(50, 18, true, "توصیه نمی شود"),
            Answers(51, 18, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(52, 19, true, "توصیه می شود"),
            Answers(53, 19, false, "توصیه نمی شود"),
            Answers(54, 19, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(55, 20, true, "توصیه می شود"),
            Answers(56, 20, false, "توصیه نمی شود"),
            Answers(57, 20, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(58, 21, true, "توصیه می شود"),
            Answers(59, 21, false, "توصیه نمی شود"),
            Answers(60, 21, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(61, 22, false, "توصیه می شود"),
            Answers(62, 22, true, "توصیه نمی شود"),
            Answers(63, 22, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(64, 23, false, "توصیه می شود"),
            Answers(65, 23, true, "توصیه نمی شود"),
            Answers(66, 23, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(67, 24, false, "توصیه می شود"),
            Answers(68, 24, true, "توصیه نمی شود"),
            Answers(69, 24, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(70, 25, false, "توصیه می شود"),
            Answers(71, 25, true, "توصیه نمی شود"),
            Answers(72, 25, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(73, 26, false, "توصیه می شود"),
            Answers(74, 26, true, "توصیه نمی شود"),
            Answers(75, 26, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),





            )

    }
}