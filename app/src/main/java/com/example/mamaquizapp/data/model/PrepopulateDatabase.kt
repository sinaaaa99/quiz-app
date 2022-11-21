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
                answerState = true,
                isLast = false,
                isAnswered = false,
                "برای زنان باردار سالم که شروع لیبر خود¬به¬خودی دارند، سیاست تأخیر در پذیرش در بخش لیبر تا شروع فاز فعال تنها بعد از انجام تحقیقات دقیق توصیه می¬شود. از سوی دیگر با در نظر گرفتن مسافت زیاد (ساکن در شهرستان) از بیمارستان بهتر است بستری شوند.\n" +
                        "\uF0A7\tتا زمانیکه شواهد بیشتری فراهم شود، زنانی که به تسهیلات زایمان مراجعه می\u200Cکنند، حتی در اوایل لیبر، بایستی به طرز مناسبی بستری و حمایت شوند، مگر اینکه ترجیح وی منتظر ماندن در منزل تا شروع فاز فعال لیبر باشد. \n" +
                        "\uF0A7\tبرای زنانی که در بخش لیبر در مراحل اولیه فاز نهفته بستری می\u200Cشوند، اگر حال مادر و جنین خوب است بهتر است از مداخلات پزشکی برای تسریع لیبر و زایمان پرهیز شود.\n"
            ),
            Questions(
                2,
                "بایستی تمامی مراقبتها فقط توسط یک ماما، در طول مراحل مختلف لیبر، زایمان و پس از زایمان ارائه گردد.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "مدل¬های مراقبت مستمر ماما (MLCC) مدل¬هایی از مراقبت هستند که در آن یک مامای شناخته شده و قابل اعتماد (مامای کیس-لود) یا گروه کوچکی از ماماهای شناخته شده (مامای تیمی)، یک زن را در دوره\u200Cی بارداری، زایمان و پس از زایمان برای سهولت بارداری و زایمان و عملکردهای والدی سالم حمایت می\u200Cکنند. بایستی اجرای این مدل در محیط¬های بدون برنامه¬ی مامایی کارآمد، پس از افزایش ماماهای شاغل (و بهبود کیفیت) در نظر گرفته شود. بنابراین با توجه به عدم وجود شرایط لازم و کافی در سیستم بهداشتی کشور ما، در حال حاضر توصیه نمی¬شود. "
            ),
            Questions(
                3,
                "تحت هر شرایطی، تمامی حقوق زن باردار (حریم خصوصی، استقلال و مشارکت در تصمیم¬گیری) بایستی توسط تیم مراقبتی رعایت شود.",
                1,
                answerState = true,
                isLast = false,
                isAnswered = false,
                "حقوق زنان باردار و مادران توسط تیم مراقبت مورد توجه قرار گیرد. مراقبتی که کرامت، حریم خصوصی و محرمانه بودن تمامی زنان را حفظ نموده، مراقبت عاری از آسیب و بدرفتاری را تضمین و امکان انتخاب آگاهانه، پشتیبانی مداوم و مراقبت توام با توجه، همدلی و درک در طول لیبر و زایمان را فراهم ¬کند."
            ),
            Questions(
                4,
                "با توجه به موانع فرهنگی و فرصت ناکافی برای ایجاد صمیمت بین زن و مراقب، مراقب بهتر است زن را با اسمش خطاب نکند و از عنوان خانم استفاده نماید.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "ارتباط موثر بین مراقب و زن، با استفاده از روش¬های ساده و پذیرفته شده به لحاظ فرهنگی توصیه¬ می\u200Cشود. یکی از شروط لازم این است که مراقب بایستی خود را به مادر و همراه¬ وی معرفی نموده و وی را با اسم¬ش خطاب نماید. "
            ),
            Questions(
                5,
                "در صورت تسلط زن و خانواده ی وی به زبان رسمی کشور، مراقب بهتر است اطلاعات مورد نیاز را به این زبان به ایشان ارائه و توضیح دهد.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "توصیه شده است که اطلاعات مورد نیاز زن و خانواده\u200Cی وی به روشی شفاف، مختصر و به زبان مادری زن و خانواده\u200Cی وی، ارائه شود. "
            ),
            Questions(
                6,
                "در صورتی که زن تمایلی به داشتن همراه در لیبر نداشته باشد، مراقب بهتر است وی را از مزایای داشتن همراه و دریافت حمایت بیشتر در صورت داشتن همراه، آگاه و ترغیب نماید.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "انتخاب همراه حین لیبر و زایمان برای تمامی زنان توصیه¬ می\u200Cشود. \n" +
                        "\uF0A7\tبایستی به خواسته¬های زنان احترام گذاشته شود از جمله خواسته زنانی که ترجیح می¬دهند همراه نداشته باشند.\n" +
                        "\uF0A7\tهمراه در این بستر می\u200Cتواند هر فردی باشد که توسط زن برای ارائه\u200Cی حمایت مستمر حین لیبر و زایمان انتخاب می\u200Cشود. ممکن است فردی از خانواده\u200Cی زن یا شبکه\u200Cی اجتماعی نظیر شریک جنسی/ همسر او، دوست یا خویشاوند زن، عضو جامعه (نظیر یک رهبر انجمن زن، کارمند بهداشت یا عامل زایمان سنتی) یا یک دولا (نظیر زنی که برای ارائه حمایت در لیبر آموزش دیده است، اما بخشی از نیروی کار حرفه\u200Cای تسهیلات مراقبت بهداشتی نیست) باشد.\n"
            ),
            Questions(
                7,
                "مراقب بایستی به زن اطلاعات کافی در مورد تعریف فاز نهفته را ارائه نماید.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "استفاده از تعاریف زیر برای فازهای نهفته و فعال در مرحله اول لیبر توصیه¬ می\u200Cشوند.\n" +
                        "مرحله\u200Cی نهفته، دوره\u200Cی زمانی است که با انقباضات دردناک رحمی و تغییرات متغیر سرویکس توصیف می\u200Cشوند که شامل درجاتی از افاسمان و پیشرفت آهسته\u200Cتر دیلاتاسیون تا حداکثر 5 سانتی\u200Cمتر برای زنان نخست زا و چند زا است. \n"
            ),
            Questions(
                8,
                "مراقب بایستی زن باردار را از مکانیسم¬های موجود برای رسیدگی به شکایات مطلع نماید.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "توصیه می¬شود که مراقب از اینکه زن از مکانیسم¬های موجود برای رسیدگی به شکایات مطلع است؛ اطمینان حاصل نماید."
            ),
            Questions(
                9,
                "مراقب بهتر است حین برقراری ارتباط با زن، بجای استفاده از اصطلاحات عامیانه از اصطلاحات علمی و تخصصی استفاده نماید.",
                1,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "توصیه می¬شود که از اصطلاحات تخصصی پزشکی پرهیز و از اشکال و تصاویر در مواقع موردنیاز برای فرایندهای ارتباطی یا پروسیجرها استفاده گردد."
            ),
            Questions(
                10,
                "با توجه به موانع فرهنگی، بهتر است به زن توصیه نمود که بجای همسر یکی از خویشاوندان همجنس خود را به عنوان همراه انتخاب نماید.",
                1,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "اقدامات ساده برای اجازه دادن به خویشاوند زن برای همراهی زنان حین لیبر می¬تواند به عنوان شیوه¬های مقرون به صرفه و حساس از نظر فرهنگی برای رفع نگرانی¬های مربوط به موانع فرهنگی مورد استفاده قرار گیرد. اگر همراه لیبر در محیط\u200Cهایی اجرا می\u200Cشود که بخش\u200Cهای زایمان بیش از یک تخت در هر اتاق دارند، باید مسئله¬ی حریم خصوصی و محرمانگی همه زنان رعایت شود (مثلاً با استفاده مداوم از پرده\u200C یا جداکننده¬ها). "
            ),

            //question type 2
            Questions(
                11,
                "زن بایستی مطلع شود که حداکثر تا 12 ساعت وارد فاز فعال لیبر خواهد شد.",
                2,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "زن باید مطلع شوند که مدت زمان استانداردی برای فاز نهفته ثابت نشده است و می¬تواند این مدت از یک زن به زن دیگر متفاوت باشد."
            ),
            Questions(
                12,
                "پلویمتری بالینی (سایز و شکل لگن) در پذیرش لیبر صورت گیرد.",
                2,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "پلویمتری بالینی روتین هنگام بستری شدن برای زنان باردار سالم در واحد لیبر توصیه¬ نمی¬شود. \n" +
                        "\uF0A7\tپلویمتری بالینی عبارت است از ارزیابی کفایت شکل و اندازه لگن مادر (ورودی، میانی و خروجی لگن) برای زایمان طبیعی از طریق معاینه داخلی لگن بوده و نباید با معاینه استاندارد لگن در هنگام پذیرش برای واحد لیبر که شامل ارزیابی بالینی وضعیت سرویکس، مایع آمنیوتیک، جایگاه و موقعیت جنین است اشتباه گرفته شود.\n" +
                        "\uF0A7\tشواهد غیرمستقیم حاصل از مطالعات انجام شده در مورد پلویمتری اشعه ایکس نشان می¬دهد که پلویمتری روتین در زنان باردار سالم هنگام بستری شدن در واحد لیبر ممکن است سزارین را بدون اینکه مزایای مشخصی از نظر پیامدهای زایمانی داشته باشد، افزایش دهد.\n"
            ),
            Questions(
                13,
                "کاردیوتوکوگرافی برای ارزیابی سلامت جنین انجام گیرد.",
                2,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "کاردیوتوکوگرافی روتین برای ارزیابی وضعیت جنین در هنگام پذیرش در لیبر در زنان باردار سالمی که با لیبر خودبه\u200Cخودی مراجعه می\u200Cکنند، توصیه نمی\u200Cشود. کاردیوتوکوگرافی مداوم، سزارین و سایر مداخلات پزشکی را بدون اینکه هزینه اثربخش باشد و با سهولت و مقبولیت متفاوت، افزایش می\u200Cدهد. "
            ),
            Questions(
                14,
                "سمع قلب جنین برای ارزیابی سلامت جنین انجام گیرد.",
                2,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "سمع با استفاده از دستگاه سونوگرافی داپلر یا استتوسکوپ جنینی پینارد برای ارزیابی سلامت جنین در هنگام پذیرش در لیبر توصیه می¬شود. ارزیابی وضعیت جنین در هنگام بستری و به طور منظم حین لیبر، با سمع ضربان قلب جنین، بخش حیاتی و جدایی¬ناپذیر ارائه مراقبت¬های حین زایمانی باکیفیت است. در مرحله اول فعال لیبر، سمع معمولاً هر 15 تا 30 دقیقه انجام می-شود، در حالی که در مرحله دوم معمولاً هر 5 دقیقه انجام می¬شود."
            ),
            Questions(
                15,
                "اصلاح موهای پرینه یا پوبیس انجام گیرد.",
                2,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "اصلاح روتین موهای پرینه/ پوبیس قبل از زایمان واژینال توصیه نمی¬شود. تصمیم¬گیری در مورد شیو کردن موهای پرینه/ پوبیس باید به عهده زن باشد نه مراقب. در شرایطی که زنی ترجیح می\u200Cدهد قبل از زایمان شیو موهای پرینه/ پوبیس را انجام دهد، باید به وی توصیه شود که در هر کجا و توسط هر کسی که راحت\u200Cتر است شیو شود (مثلاً در خانه، کمی قبل از زمان لیبر و زایمان)"
            ),
            Questions(
                16,
                "برای کاهش استفاده از تقویت لیبر (Argumentation) انما انجام گیرد.",
                2,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "انما در هنگام پذیرش برای کاهش استفاده از تقویت لیبر (augmentation) توصیه نمی¬شود. استفاده معمول از انما، طول مدت لیبر را کاهش نمی¬دهد و مزایای بالینی دیگری نیز به همراه ندارد و عملی تهاجمی در نظر گرفته می¬شود و با ناراحتی برای زنان همراه است."
            ),

            //question type 3
            Questions(
                17,
                "مراقب بایستی زن را از میزان پیشرفت فاز فعال مطلع نماید و در صورت میزان دیلاتاسیون کمتر از 1 سانتی¬متر در ساعت، بررسی¬های بیشتر انجام دهد.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "حداقل میزان دیلاتاسیون سرویکس 1cm/h حین فاز فعال مرحله اول لیبر به طور غیرواقع¬بینانه\u200Cای برای بعضی از زنان سریع است و بنابراین برای شناسایی پیشرفت طبیعی لیبر توصیه¬ نمی\u200Cشود. میزان دیلاتاسیون سرویکس آهسته¬تر از 1cm/h به تنهایی بهتر است به عنوان شاخص مداخله زایمانی نباشد."
            ),
            Questions(
                18,
                "معاینه واژینال در فواصل هر 2 ساعت برای ارزیابی میزان پیشرفت فاز فعال لیبر انجام گیرد.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "معاینه واژینال در فواصل هر 4 ساعت برای ارزیابی روتین فاز فعال لیبر در زنان کم¬خطر توصیه می¬شود. "
            ),
            Questions(
                19,
                "به صورت متناوب، ضربان قلب جنین سمع شود.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "سمع متناوب ضربان قلب جنین با دستگاه سونوگرافی داپلر یا استتوسکوپ جنینی پینارد برای زنان باردار سالم در طی لیبر توصیه می¬شود. \n" +
                        "فاصله زمانی: هر 15 تا 30 دقیقه در فاز فعال مرحله اول لیبر و هر 5 دقیقه در مرحله دوم لیبر سمع شود.\n" +
                        "مدت: هر سمع باید حداقل 1 دقیقه طول بکشد. اگر FHR همیشه در محدوده طبیعی (یعنی 110-160 ضربه در دقیقه) نباشد، سمع باید طولانی شود تا حداقل سه انقباض رحم را پوشش دهد. زمان: در حین انقباض رحم سمع شود و حداقل 30 ثانیه پس از انقباض ادامه داده شود.\n"
            ),
            Questions(
                20,
                "در صورت درخواست و رضایت مادر، آنالژزی اپیدورال توسط تکنسین ماهر زیر نظر متخصص بیهوشی انجام شود.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "آنالژزی اپیدورال برای زنان باردار سالمی که در طی لیبر درخواست تسکین درد دارند، بسته به ترجیحات و درخواست زن توصیه می¬شود. هر دو گزینه دارویی رایج برای تسکین درد در طی لیبر -گزینه¬های ضددرد اپیدورال و مواد اپیوئیدی- دارای مزایا و معایبی هستند. به نظر می\u200Cرسد که آنالژزی اپیدورال برای تسکین درد مؤثرتر می¬باشد، اما در مقایسه با بی\u200Cدردی اپیوئیدی، به منابع بیشتری برای اجرا و مدیریت عوارض و آثار نامطلوب آن نیاز دارد، که در آنالژزی اپیدورال رایج\u200Cتر است. برای جلوگیری از عوارض و حفظ عملکرد حرکتی تا حد ممکن، هنگام تجویز آنالژزی اپیدورال باید از کمترین غلظت مؤثر بی\u200Cحس¬کننده موضعی استفاده شود."
            ),
            Questions(
                21,
                "حدالمقدور از پتيدين جهت تسکین لیبر استفاده نشود.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "علیرغم اینکه پتیدین به طور گسترده در دسترس است و مورد استفاده قرار می¬گیرد، گزینه اپیوئیدی ترجیحی نیست، زیرا مواد اپیوئیدی با اثر کوتاه¬تر معمولاً عوارض جانبی نامطلوب کمتری دارند."
            ),
            Questions(
                22,
                "تکنیک¬های دستی مانند ماساژ و یا استفاده از کیسه گرم، اثربخشی پائین دارند.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "بیشتر زنان تمایل دارند نوعی تسکین درد دارویی یا غیردارویی در طول لیبر را داشته باشند و شواهد کیفی نشان می¬دهد که ماساژ می¬تواند احساس ناراحتی در لیبر را کاهش دهد، درد را تسکین دهد و تجربه زایمان مادر را بهبود بخشد. اما در عین حال، مراقبین باید به زنان اطلاع دهند، در حالی که تکنیک¬های دستی برای مدیریت درد بعید است مضر باشند، شواهد در مورد اثرات مفید آن قطعیت بسیار کمی دارد. "
            ),
            Questions(
                23,
                "تسکین درد برای جلوگیری از تاخیر لیبر و کاهش استفاده از تقویت لیبر انجام گیرد.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "هیچ شواهد آشکاری وجود ندارد که نشان دهد هر شکلی از تسکین درد با کاهش مدت زمان لیبر یا دفعات تقویت لیبر مرتبط است."
            ),
            Questions(
                24,
                "به منظور جلوگیری از آسپیراسیون در صورت احتمال سزارین اورژانسی، دریافت غذاهای جامد در طول لیبر منع شود.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "برای زنان در معرض خطر کم، مصرف خوراکی مایعات و غذا در طول لیبر توصیه می¬شود. هیچ موردی از سندرم مندلسون (استنشاق یا آسپیراسیون غذا و نوشیدنی از معده به ریه¬ها در طول بیهوشی عمومی که مهمترین نگرانی سلامتی در محدود کردن مصرف خوراکی در طول لیبر است) در بیش از 3000 زن شرکت¬کننده در کارآزمایی¬های موجود در مرور سیستماتیک گزارش نشده¬است."
            ),
            Questions(
                25,
                "برای جلوگیری از تاخیر لیبر و تشخیص مکونیوم احتمالی، آمنیوتومی انجام گردد.",
                3,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "استفاده از آمنیوتومی به تنهایی برای جلوگیری از تأخیر در لیبر توصیه نمی¬شود. علیرغم انجام روتین آمنیوتومی برای جلوگیری از تأخیر در لیبر در بالین، شواهد آشکاری مبنی بر اینکه مزایای بالقوه آن بیشتر از مضرات بالقوه است، وجود ندارد."
            ),
            Questions(
                26,
                "بهتر است برای کوتاه کردن طول مدت لیبر و دهیدراتاسیون مادر، از مایعات داخل وریدی (سرم) استفاده شود.",
                3,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "استفاده از مایعات وریدی با هدف کوتاه کردن طول¬مدت لیبر توصیه نمی¬شود. استفاده گسترده و غیرضروری مایعات داخل وریدی برای همه زنان حین لیبر، علاوه بر احتمال خطر اضافه بار مایعات، هزینه مراکز درمانی را افزایش و تحرک زنان را کاهش می¬دهد. "
            ),
            //question type 4
            Questions(
                27,
                ".زن بایستی توسط مراقب مطلع شود که حداکثر در عرض 30 دقیقه نوزادش را به دنیا خواهد آورد",
                4,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "استفاده از تعریف و طول مدت مرحله دوم لیبر در ادامه برای استفاده توصیه می\u200Cشود. \n" +
                        "تعریف: مرحله دوم یک دوره زمانی بین دیلاتاسیون کامل سرویکس تا تولد نوزاد است که در طی این دوره زن در نتیجه انقباضات شدید رحمی، یک تمایل غیرارادی برای زور دادن و خروج جنین دارد. \n" +
                        "مدت زمان: زنان باید مطلع شوند که مدت زمان مرحله دوم لیبر از یک زن به زن دیگر متفاوت است. در زنان نخست¬زا، معمولاً این مرحله در عرض 3 ساعت و در زنان مولتی¬پار، در عرض 2 ساعت کامل می¬شود.\n"
            ),
            Questions(
                28,
                "در صورت درخواست خود زن، ممانعتی برای زایمان با وضعیت ایستاده وجود ندارد.",
                4,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "برای زنان بدون دریافت بی¬حسی اپیدورال، تشویق پذیرش وضعیت¬های مختلف زایمانی به انتخاب خود زن از جمله وضعیت-های ایستاده توصیه می¬شود.\n" +
                        "شواهد توصیه می\u200Cکنند که وضعیت¬های زایمانی ایستاده حین مرحله\u200Cی دوم زایمان ممکن است باعث کاهش اپی¬زیاتومی و زایمان واژینال ابزاری بشوند، اما ممکن است با افزایش خطر خونریزی پس از زایمان (PPH) و پارگی¬های درجه دو همراه شوند. مراقب بایستی مطمئن شود که سلامت نوزاد در وضعیت انتخابی مادر به اندازه\u200Cی کافی تحت نظارت است. اگر نیاز باشد که تغییری در وضعیت انجام شود تا نظارت کافی بر جنین تأمین شود، بهتر است با شفافیت برای مادر توضیح داده شود. یک رویکرد عملی درست قبل از خروج جنین، برای زنانی که تمایل به وضعیت زایمانی ایستاده دارند، احتمالاً تبدیل به وضعیت نیمه دراز کشیده یا چهار دست و پا باشد تا انجام تکنیک¬¬های پرینه برای کاهش پارگی و خونریزی را تسهیل کند.\n"
            ),
            Questions(
                29,
                "برای جلوگیری از بیماری¬های عفونی بهتر است واژن با کلرهگزیدین شستشو گردد.",
                4,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "این کار مزایای بالینی برای نوزاد از جهت پیشگیری از استرپتوکوک گروه B ندارد. "
            ),
            Questions(
                30,
                "به منظور کاهش آسیب پرینه بهتر است ماساژ پرینه و کمپرس گرم توسط عامل زایمان انجام گیرد.",
                4,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "برای زنانی که در مرحله دوم لیبر قرار دارند، تکنیک¬های کاهش آسیب پرینه و تسهیل لیبر خود¬به¬خودی شامل ماساژ پرینه، کمپرس گرم و قرار دادن دست روی پرینه برای محافظت، بر اساس ترجیحات زن و گزینه¬های در دسترس، توصیه می¬شود. شواهد نشان می\u200Cدهند که ماساژ پرینه ممکن است شانس سالم نگه داشتن پرینه را افزایش و خطر پارگی شدید پرینه را کاهش دهد. کمپرس¬های گرم پرینه پارگی¬های درجه سه و درجه چهار را کاهش می\u200Cدهند و روش دست روی پرینه، احتمالاً پارگی-های درجه یک پرینه را کاهش می\u200Cدهد. "
            ),
            Questions(
                31,
                "به منظور جلوگیری از پارگی پرینه به دلیل احتمال دیستوشی، بایستی اپیزیوتومی انجام گیرد.",
                4,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "استفاده\u200Cی متداول یا آزادانه از اپی¬زیاتومی برای زنانی که در زایمان خود¬به¬خودی واژینال هستند، توصیه نمی¬شود. در حال¬ حاضر شواهدی دال بر نیاز به اپی¬زیاتومی در مراقبت روتین وجود ندارد و تعیین میزان اپی¬زیاتومی \"قابل¬قبول\" دشوار است. نقش اپی¬زیاتومی در فوریت¬های مامائی، نظیر دیسترس جنین نیازمند زایمان واژینال ابزاری در حال گسترش است. "
            ),
            Questions(
                32,
                "در صورت افت ضربان قلب، بایستی از فشار فوندال دستی برای خروج هر چه سریعتر جنین استفاده گردد.",
                4,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "استفاده از فشار فوندال دستی برای تسهیل زایمان در مرحله دوم لیبر توصیه نمی¬شود. نگرانی¬های جدی در مورد مضرات بالقوه مادر و نوزاد به دنبال این رویکرد وجود دارد."
            ),
//            question type 5
            Questions(
                33,
                "برای پیشگیری از تاخیر لیبر به دلیل دریافت بی¬حسی اپیدورال، بهتر است لیبر به صورت فعال (تجویز هیوسین، اکسی¬توسین، میزوپروستول و ...) مدیریت گردد.",
                5,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "بسته مراقبتی برای مدیریت فعال لیبر برای جلوگیری از تأخیر در لیبر توصیه نمی¬شود. تقویت لیبر (اکسی¬توسین، میزوپروستول، ...) باید زمانی تجویز شود تأخیر در پیشرفت لیبر تأیید شده باشد."
            ),
            Questions(
                34,
                "به دلیل احتمال هیپوکسی در اثر دریافت اپیدورال، بلافاصله پس از کامل شدن دیلاتاسیون بایستی مادر را به زور دادن تشویق نمود.",
                5,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "برای زنان دریافت¬کننده بی¬حسی اپیدورال در مرحله دوم لیبر، تأخیر در فشار دادن یک تا دو ساعت پس از دیلاتاسیون کامل و یا تا زمانی که زن احساس زور دادن خود را بدست آورد، در جوامعی که در آنجا منابع برای ماندن طولانی¬تر در مرحله دوم در دسترس هستند و هیپوکسی پری¬ناتال می¬تواند به اندازه کافی ارزیابی و مدیریت شود، توصیه می¬شود. "
            ),
            Questions(
                35,
                "به دلیل احتمال سرگیجه، بایستی در وضعیت لیتاتومی زایمان نماید.",
                5,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "برای زنان با بی¬حسی اپیدورال، تشویق پذیرش وضعیت¬های مختلف زایمانی به انتخاب خود زن از جمله وضعیت¬های ایستاده توصیه می¬شود. بیشتر بی\u200Cدردی\u200Cهای اپیدورال که در حال حاضر ارائه می\u200Cشوند، بی\u200Cدردی اپیدورال با دوز پایین و بی\u200Cدردی اپیدورال «متحرک» هستند که انتخاب وضعیت¬های مختلف زایمانی را امکان\u200Cپذیر می\u200Cکند."
            ),
            Questions(
                36,
                "بند ناف بایستی در طی کمتر از یک دقیقه قطع و وضعیت نوزاد هر چه سریعتر از نظر عوارض احتمالی اپیدورال بررسی شود.",
                5,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "کلامپ تأخیری بند ناف (نه زودتر از یک دقیقه بعد از تولد) برای بهبود سلامت مادر و نوزاد و نتایج تغذیه\u200Cای حتی در زایمان¬هایی که بی¬دردی اپیدورال دریافت کرده¬اند، توصیه می\u200Cشود. "
            ),
//            question type 6
            Questions(
                37,
                "بدلیل بدون عارضه بودن زایمان و عدم خونریزی شدید پس از زایمان، استفاده از منقبض کننده¬های رحم (یوتروتونیک) به عنوان پیشگیری از خونریزی ضروری نیست.",
                6,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "استفاده از منقبض¬کننده¬ها برای پیشگیری از خونریزی پس از زایمان حین مرحله\u200Cی سوم زایمان برای تمام زایمان¬ها توصیه می\u200Cشود. اکسی¬توسین (10IU, IM/IV) بعنوان داروی منقبض¬کننده¬ی رحمی، برای پیشگیری از خونریزی بعد از زایمان توصیه می¬شود. در محیط¬هایی که اکسی¬توسین در دسترس نیست، استفاده از انقباض¬دهنده\u200Cهای تزریقی دیگر (اگر مناسب باشند، ارگومترین/ متیل ارگومترین یا ترکیب ثابت دارویی اکسی¬توسین و ارگومترین) یا میزوپروستول خوراکی (600μg) توصیه می\u200Cشود. "
            ),
            Questions(
                38,
                "بهتر است جفت از طریق کشش کنترل شده بند ناف خارج گردد.",
                6,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "در مراکزی که عاملین زایمانی ماهر در دسترس هستند، کشش کنترل شده بند ناف توصیه می¬شود؛ در صورتیکه مادر خون کمی در طول مرحله سوم لیبر از دست داده باشد."
            ),
            Questions(
                39,
                "برای جلوگیری از خونریزی پس از زایمان بایستی پس از خروج جفت ماساژ مداوم رحمی انجام گیرد.",
                6,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "ماساژ رحمی مداوم به عنوان مداخله\u200Cای در پیشگیری از خونریزی پس از زایمان در زنانی که اکسی¬توسین پیشگیری کننده را دریافت کرده\u200Cاند، توصیه نمی\u200Cشود."
            ),
            Questions(
                40,
                "بدلیل شروع خودبخود تنفس، ساکشن دهان و بینی نوزاد نباید انجام شود.",
                6,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "در نوزادان متولد شده با مایع آمنیوتیک روشن که پس از تولد خودبخود شروع به تنفس می¬کنند، ساکشن دهان و بینی نباید انجام شود."
            ),
            Questions(
                41,
                "در ساعت اول پس از زایمان، برای جلوگیری از هیپوترمی و ترویج تغذیه با شیر مادر، نوزاد در تماس پوست با پوست با مادر باشد.",
                6,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "نوزادان بدون عارضه باید در ساعت اول برای جلوگیری از هیپوترمی و ترویج تغذیه با شیر مادر در تماس پوست با پوست با مادران خود نگه داشته شوند."
            ),
            Questions(
                42,
                "حمام دادن نوزاد باید تا 12 ساعت پس از تولد به تاخیر انداخته شود.",
                6,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "حمام کردن باید تا 24 ساعت پس از تولد به تأخیر انداخته شود. اگر این به دلایل فرهنگی ممکن نیست، حمام کردن باید حداقل شش ساعت به تعویق بیفتد. لباس مناسب کودک متناسب با دمای محیط توصیه می¬شود. مادر و کودک نباید از هم جدا شود و باید تمام ساعات شبانه¬روز در یک اتاق باشند."
            ),
            //question type 7
            Questions(
                43,
                "بایستی از نظر خونریزی واژینال، ارتفاع رحم، درجه حرارت و ضربان قلب به طور منظم در طول 24 ساعت اول پس از زایمان ارزیابی شوند.",
                7,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "همه زنان باید به طور منظم از نظر خونریزی واژینال، تونوسیته رحمی، ارتفاع رحم، دما و ضربان قلب به طور مرتب در طول 24 ساعت اول پس از زایمان ارزیابی شوند. فشارخون باید کمی بعد از زایمان اندازه¬گیری شود. اگر طبیعی باشد، اندازه¬گیری فشارخون دوم باید در عرض شش ساعت انجام شود. حجم ادرار باید ظرف شش ساعت ثبت شود."
            ),
            Questions(
                44,
                "برای تشخیص زود هنگام آتونی رحمی بایستی ارزیابی تونوسیته رحمی پس از زایمان انجام گیرد.",
                7,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "ارزیابی تونوسیته رحمی بعد از زایمان برای تشخیص زودهنگام آتونی رحمی برای همه زنان توصیه می¬شود. ارزیابی رایج و مکرر تونوسیته رحمی بخش ضروری از مراقبت¬های پس از زایمان به خصوص برای  تشخیص زود هنگام PPH است."
            ),
            Questions(
                45,
                "بهتر است به منظور پیشگیری از عفونت محل اپی¬زیاتومی، مراقبتهای لازم آموزش و آنتی¬بیوتیک تجویز شود.",
                7,
                answerState = false,
                isLast = false,
                isAnswered = false,
                "آنتی¬بیوتیک روتین پیشگیرانه برای زنان با اپی¬زیاتومی توصیه نمی¬شود. آنتی¬بیوتیک¬ها بهتر است تنها زمانی تجویز شوند که علایم بالینی برای عفونت زخم اپی¬زیاتومی وجود دارند."
            ),
            Questions(
                46,
                "بدلیل بدون عارضه بودن زایمان، مادر و نوزاد 12 ساعت پس از زایمان می¬توانند از بیمارستان ترخیص شوند.",
                7,
                answerState = false,
                isLast = true,
                isAnswered = false,
                "پس از زایمان طبیعی بدون عارضه در یک مرکز مراقبت سلامتی، مادران و نوزادان سالم باید در این مرکز حداقل 24 ساعت پس از زایمان مراقبت شوند."
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


            //answer type 3
            Answers(49, 17, false, "توصیه می شود"),
            Answers(50, 17, true, "توصیه نمی شود"),
            Answers(51, 17, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(52, 18, false, "توصیه می شود"),
            Answers(53, 18, true, "توصیه نمی شود"),
            Answers(54, 18, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(55, 19, true, "توصیه می شود"),
            Answers(56, 19, false, "توصیه نمی شود"),
            Answers(57, 19, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(58, 20, true, "توصیه می شود"),
            Answers(59, 20, false, "توصیه نمی شود"),
            Answers(60, 20, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(61, 21, true, "توصیه می شود"),
            Answers(62, 21, false, "توصیه نمی شود"),
            Answers(63, 21, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(64, 22, false, "توصیه می شود"),
            Answers(65, 22, true, "توصیه نمی شود"),
            Answers(66, 22, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(67, 23, false, "توصیه می شود"),
            Answers(68, 23, true, "توصیه نمی شود"),
            Answers(69, 23, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(70, 24, false, "توصیه می شود"),
            Answers(71, 24, true, "توصیه نمی شود"),
            Answers(72, 24, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(73, 25, false, "توصیه می شود"),
            Answers(74, 25, true, "توصیه نمی شود"),
            Answers(75, 25, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(76, 26, false, "توصیه می شود"),
            Answers(77, 26, true, "توصیه نمی شود"),
            Answers(78, 26, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            //answer type 4
            Answers(79, 27, false, "توصیه می شود"),
            Answers(80, 27, true, "توصیه نمی شود"),
            Answers(81, 27, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(82, 28, true, "توصیه می شود"),
            Answers(83, 28, false, "توصیه نمی شود"),
            Answers(84, 28, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(85, 29, false, "توصیه می شود"),
            Answers(86, 29, true, "توصیه نمی شود"),
            Answers(87, 29, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(88, 30, true, "توصیه می شود"),
            Answers(89, 30, false, "توصیه نمی شود"),
            Answers(90, 30, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(91, 31, false, "توصیه می شود"),
            Answers(92, 31, true, "توصیه نمی شود"),
            Answers(93, 31, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(94, 32, false, "توصیه می شود"),
            Answers(95, 32, true, "توصیه نمی شود"),
            Answers(96, 32, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            //answer type 5
            Answers(97, 33, false, "توصیه می شود"),
            Answers(98, 33, true, "توصیه نمی شود"),
            Answers(99, 33, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(100, 34, false, "توصیه می شود"),
            Answers(101, 34, true, "توصیه نمی شود"),
            Answers(102, 34, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(103, 35, false, "توصیه می شود"),
            Answers(104, 35, true, "توصیه نمی شود"),
            Answers(105, 35, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(106, 36, false, "توصیه می شود"),
            Answers(107, 36, true, "توصیه نمی شود"),
            Answers(108, 36, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            //answer type 6
            Answers(109, 37, false, "توصیه می شود"),
            Answers(110, 37, true, "توصیه نمی شود"),
            Answers(111, 37, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(112, 38, true, "توصیه می شود"),
            Answers(113, 38, false, "توصیه نمی شود"),
            Answers(114, 38, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(115, 39, false, "توصیه می شود"),
            Answers(116, 39, true, "توصیه نمی شود"),
            Answers(117, 39, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(118, 40, true, "توصیه می شود"),
            Answers(119, 40, false, "توصیه نمی شود"),
            Answers(120, 40, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(121, 41, true, "توصیه می شود"),
            Answers(122, 41, false, "توصیه نمی شود"),
            Answers(123, 41, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(124, 42, false, "توصیه می شود"),
            Answers(125, 42, true, "توصیه نمی شود"),
            Answers(126, 42, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            //answer type 7
            Answers(127, 43, false, "توصیه می شود"),
            Answers(128, 43, true, "توصیه نمی شود"),
            Answers(129, 43, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(130, 44, true, "توصیه می شود"),
            Answers(131, 44, false, "توصیه نمی شود"),
            Answers(132, 44, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(133, 45, false, "توصیه می شود"),
            Answers(134, 45, true, "توصیه نمی شود"),
            Answers(135, 45, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست"),

            Answers(136, 46, false, "توصیه می شود"),
            Answers(137, 46, true, "توصیه نمی شود"),
            Answers(138, 46, false, "با توجه به بستر/ وضعیت موجود، امکان پذیر نیست")
        )

    }
}