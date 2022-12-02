package com.example.mamaquizapp.data.model

object PrepopulateSuggestion {

    val listOfSuggestion1 = commitSuggestionType1()
    val listOfSuggestion2 = commitSuggestionType2()
    val listOfSuggestion3 = commitSuggestionType3()
    val listOfSuggestion4 = commitSuggestionType4()
    val listOfSuggestion5 = commitSuggestionType5()
    val listOfSuggestion6 = commitSuggestionType6()

    private fun commitSuggestionType1(): List<SuggestionType1> {

        return listOf(

            SuggestionType1(
                1,
                "مراقبت در طول لیبر و زایمان",
                "مراقبت مادری احترام آمیز",
                "حقوق زنان باردار و مادران توسط تیم مراقبت مورد توجه قرار گیرد. مراقبتی که کرامت، حریم خصوصی و محرمانه بودن تمامی زنان را حفظ نموده، مراقبت عاری از آسیب و بدرفتاری را تضمین و امکان انتخاب آگاهانه، پشتیبانی مداوم و مراقبت توام با توجه، همدلی و درک در طول لیبر و زایمان را فراهم کند.",
                "توصیه شده"
            ),
            SuggestionType1(
                2,
                "مراقبت در طول لیبر و زایمان",
                "ارتباط موثر",
                "ارتباط موثر بین ارائه دهندگان مراقبت و زنان، با استفاده از روش¬های ساده و قابل قبول از نظر فرهنگی در طول لیبر برقرار شود.",
                "توصیه شده"
            ),
            SuggestionType1(
                3,
                "مراقبت در طول لیبر و زایمان",
                "داشتن همراه در طول لیبر و زایمان",
                "حق انتخاب همراه در طول لیبر و زایمان به زنان داده شود.",
                "توصیه شده"
            ),
            SuggestionType1(
                4,
                "مراقبت در طول لیبر و زایمان",
                "مراقبت مستمر",
                "مدلهای تداوم مراقبت ماما محور- که در آن یک ماما یا گروه کوچکی از ماماها شناخته شده از یک زن در سراسر دوره¬ی قبل از زایمان، زایمان و پس از زایمان پشتیبانی می¬کند، فراهم شود.",
                "توصیه وابسته به فرهنگ"
            )
        )
    }

    private fun commitSuggestionType2(): List<SuggestionType2> {

        return listOf(

            SuggestionType2(
                1,
                "مرحله اول لیبر",
                "تعاریف فاز نهفته و فعال مرحله ی اول لیبر",
                "مرحله نهفته یک دوره زمانی است که با انقباضات دردناک رحمی، تغییرات متغیر سرویکس شامل درجاتی از افاسمان و پیشرفت  آهسته دیلاتاسیون حداکثر تا 5 سانتی متر مشخص شده است.\n" +
                        "فاز فعال با انقباضات دردناک و منظم رحمی، درجه ی قابل توجهی از افاسمان و دیلاتاسیون سریع سرویکس از 5 سانتی متر تا دیلاتاسیون کامل مشخص شده است.\n",
                "توصیه شده"
            ),
            SuggestionType2(
                2,
                "مرحله اول لیبر",
                "طول مدت مرحله ی اول لیبر",
                "زنان باید مطلع شوند که مدت زمان استانداردی برای فاز نهفته ثابت نشده است و می تواند این مدت از یک زن به زن دیگر متفاوت باشد. اما مدت زمان فاز فعال لیبر معمولاً نباید به طور معمول بیش از 12 ساعت در زایمان اول و  بیش از 10 ساعت در زایمان های بعدی طول بکشد",
                "توصیه شده"
            ),
            SuggestionType2(
                3,
                "مرحله اول لیبر",
                "پیشرفت مرحله ی اول لیبر",
                "برای زنانی با شروع لیبر خودبخود، میزان آستانه ی دیلاتاسیون یک سانتی متر در ساعت در طول فاز فعال مرحله اول لیبر برای شناسایی زنان در معرض خطر پیامدهای نامطلوب زایمانی نادرست است",
                "توصیه نشده"
            ),
            SuggestionType2(
                4,
                "مرحله اول لیبر",
                "پیشرفت مرحله ی اول لیبر",
                "حداقل میزان دیلاتاسیون 1 سانتی متر در ساعت در فاز فعال مرحله اول لیبر برای شناسایی پیشرفت طبیعی لیبر پیشنهاد نمی شود. میزان دیلاتاسیون کمتر از 1 سانتی متر در ساعت به تنهایی نباید یک اندیکاسیون روتین برای مداخله زایمان باشد",
                "توصیه نشده"
            ),
            SuggestionType2(
                5,
                "مرحله اول لیبر",
                "پیشرفت مرحله ی اول لیبر",
                "لیبر به طور طبیعی تسریع نمی شود تا زمانی که دیلاتاسیون به آستانه 5 سانتی متر برسد. بنابراین استفاده از مداخلات پزشکی برای تسریع لیبر و زایمان (مانند اکسی توسین یا سزارین) قبل از این آستانه در صورت شرایط مادری و جنینی اطمینان بخش پیشنهاد نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                6,
                "مرحله اول لیبر",
                "سیاست پذیرش بخش لیبر",
                "برای زنان باردار سالم که شروع لیبر خود به خودی دارند، سیاست تاخیر در پذیرش در بخش لیبر تا شروع فاز فعال در زمینه تحقیقات دقیق توصیه می شود",
                "توصیه زمینه پژوهش"
            ),
            SuggestionType2(
                7,
                "مرحله اول لیبر",
                "ارزیابی بالینی لگن موقع پذیرش",
                "ارزیابی بالینی لگن در هنگام بستری در زنان باردار سالم توصيه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                8,
                "مرحله اول لیبر",
                "ارزیابی روتین سلامت جنین هنگام پذیرش در لیبر",
                "کاردیوتوکوگرافی روتین برای ارزیابی سلامت جنین در هنگام پذیرش در لیبر در زنان باردار سالم با شروع خودبخود لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                9,
                "مرحله اول لیبر",
                "ارزیابی روتین سلامت جنین هنگام پذیرش در لیبر",
                "سمع قلب جنین با استفاده از یک دستگاه سونوگرافی داپلر یا استتوسکوپ پینارد برای ارزیابی سلامت جنین هنگام پذیرش در لیبر توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                10,
                "مرحله اول لیبر",
                "اصلاح پرینه/ پوبیس",
                "اصلاح روتین پرینه یا پوبیس قبل از زایمان توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                11,
                "مرحله اول لیبر",
                "انما موقع پذیرش",
                "بکارگیری انما برای کاهش استفاده از تقویت لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                12,
                "مرحله اول لیبر",
                "معاینه واژینال",
                "معاینه واژینال در فواصل هر 4 ساعت برای ارزیابی روتین فاز فعال لیبر در زنان کم خطر توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                13,
                "مرحله اول لیبر",
                "کاردیوتوکوگرافی مداوم در لیبر",
                "کاردیوتوکوگرافی مداوم برای ارزیابی سلامت جنین در زنان سالم تحت لیبر خودبخود توصیه نمی شود",
                "توصیه شده"
            ),
            SuggestionType2(
                14,
                "مرحله اول لیبر",
                "سمع متناوب ضربان قلب جنین در طول لیبر",
                "سمع متناوب ضربان قلب جنین در طول لیبر با استفاده از دستگاه سونوگرافی داپلر یا استتوسکوپ پینارد در زنان سالم توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                15,
                "مرحله اول لیبر",
                "آنالژزی اپیدورال برای تسکین درد",
                "آنالژزی اپیدورال برای زنان سالم درخواست کننده تسکین درد در طول لیبر بسته به ترجیح خود زن توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                16,
                "مرحله اول لیبر",
                "آنالژزی مخدر برای تسکین درد",
                "گزینه های اپيوئيدهاى تزريقی مانند فنتانيل، ديامورفين و پتيدين برای زنان سالم درخواست کننده تسکین درد در طول لیبر بسته به ترجیح خود زن توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                17,
                "مرحله اول لیبر",
                "تکنیک¬های تن آرامی برای مدیریت لیبر",
                "تکنیک های تن آرامی برای مدیریت لیبر از جمله تن آرامی پیشرونده عضلانی، تنفس، موسیقی، ذهن آگاهی و تکنیک های دیگر، برای زنان سالم درخواست کننده تسکین درد در طول لیبر بسته به ترجیح خود زن توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                18,
                "مرحله اول لیبر",
                "تکنیک¬های دستی برای مدیریت لیبر",
                "تکنیک های دستی مانند ماساژ و یا استفاده از کیسه گرم، برای زنان سالم درخواست کننده تسکین درد در طول لیبر بسته به ترجیح خود زن توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                19,
                "مرحله اول لیبر",
                "تسکین درد برای جلوگیری از تاخیر لیبر",
                "تسکین درد برای جلوگیری از تاخیر لیبر و کاهش استفاده از تقویت لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                20,
                "مرحله اول لیبر",
                "مایعات خوراکی و غذا",
                "برای زنان کم خطر، دریافت مایعات خوراکی و غذا در طول لیبر توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                21,
                "مرحله اول لیبر",
                "تحرک و وضعیت مادری",
                "تشویق برای تحرک و وضعیت ایستاده در طول لیبر در زنان کم خطر توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType2(
                22,
                "مرحله اول لیبر",
                "پاکسازی واژن",
                "پاکسازی روتین واژن با کلرهگزیدین در طول لیبر برای جلوگیری از بیماری های عفونی توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                23,
                "مرحله اول لیبر",
                "مدیریت فعال لیبر",
                "یک بسته مراقبتی برای مدیریت فعال لیبر برای پیشگیری از تاخیر در لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                24,
                "مرحله اول لیبر",
                "آمنیوتومی روتین",
                "انجام روتین آمنیوتومی به تنهایی برای جلوگیری از تاخیر در لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                25,
                "مرحله اول لیبر",
                "آمنیوتومی اولیه و اکسی توسین",
                "استفاده از آمنیوتومی اولیه به همراه تقویت اولیه با اکسی توسین برای پیشگیری از تاخیر در لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                26,
                "مرحله اول لیبر",
                "اکسی توسین برای زنانی با آنالژزی اپیدورال",
                "استفاده از اکسی توسین برای پیشگیری از تاخیر در لیبر در زنان دریافت کننده بی حسی اپیدورال توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                27,
                "مرحله اول لیبر",
                "ضد اسپاسم ها",
                "استفاده از ضد اسپاسم ها برای جلوگیری از تاخیر در لیبر توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType2(
                28,
                "مرحله اول لیبر",
                "مایعات داخل وریدی برای پیشگیری از تاخیر لیبر",
                "استفاده از مایعات داخل وریدی با هدف کوتاه کردن طول  لیبر توصیه نمی شود",
                "توصیه نشده"
            ),

            )
    }


    private fun commitSuggestionType3(): List<SuggestionType3> {

        return listOf(

            SuggestionType3(
                1,
                "مرحله دوم لیبر",
                "تعریف و طول مدت مرحله دوم لیبر",
                "مرحله دوم یک دوره زمانی بین دیلاتاسیون کامل سرویکس تا تولد نوزاد است که در طی این دوره زن در نتیجه انقباضات شدید رحمی، یک درخواست غیرارادی برای زور دادن و خروج جنین دارد.\n" +
                        "زنان باید مطلع شوند که مدت زمان مرحله دوم لیبر از یک زن به زن دیگر متفاوت است. در زنان نخست زا، معمولاً این مرحله در عرض 3 ساعت و در زنان مولتی پار، در عرض 2 ساعت کامل می شود.\n",
                "توصیه شده"
            ), SuggestionType3(
                2,
                "مرحله دوم لیبر",
                "وضعیت زایمانی (برای زنان بدون بی حسی اپیدورال)",
                "برای زنان بدون دریافت بی حسی اپیدورال، تشویق پذیرش وضعیت های مختلف زایمانی به انتخاب خود زن از جمله وضعیت های ایستاده توصیه می شود",
                "توصیه شده"
            ), SuggestionType3(
                3,
                "مرحله دوم لیبر",
                "روش زور دادن",
                "زنان در فاز آخر مرحله دوم زایمان باید تشویق و حمایت شوند تا احساس میل خود برای فشار دادن را دنبال کنند",
                "توصیه شده"
            ), SuggestionType3(
                4,
                "مرحله دوم لیبر",
                "روش زور دادن (برای زنان با بی حسی اپیدورال)",
                "برای زنان دریافت کننده بی حسی اپیدورال در مرحله دوم لیبر، تاخیر در فشار دادن یک تا دو ساعت پس از دیلاتاسیون کامل و یا تا زمانی که زن احساس زور دادن خود را بدست آورد، در جوامعی که در آنجا منابع برای ماندن طولانی تر در مرحله دوم در دسترس هستند و هیپوکسی پریناتال می تواند به اندازه کافی ارزیابی و مدیریت شود، توصیه می شود",
                "توصیه وابسته به فرهنگ"
            ), SuggestionType3(
                5,
                "مرحله دوم لیبر",
                "تکنیک¬های برای جلوگیری از آسیب پرینه",
                "برای زنانی که در مرحله دوم لیبر قرار دارند، تکنیک های کاهش آسیب پرینه و تسهیل لیبر خود به خودی شامل ماساژ پرینه، و کمپرس گرم، بر اساس ترجیحات زن و گزینه های در دسترس، توصیه می شود",
                "توصیه شده"
            ), SuggestionType3(
                6,
                "مرحله دوم لیبر",
                "سیاست اپی زیاتومی",
                "استفاده روتین یا وافر از اپیزیوتومی برای زنان تحت لیبر خودبخود توصیه نمی شود",
                "توصیه نشده"
            ), SuggestionType3(
                7,
                "مرحله دوم لیبر",
                "فشار فوندال",
                "استفاده از فشار فوندال دستی برای تسهیل زایمان در مرحله دوم لیبر توصیه نمی شود",
                "توصیه نشده"
            )
        )

    }


    private fun commitSuggestionType4(): List<SuggestionType4> {

        return listOf(
            SuggestionType4(
                1,
                "مرحله سوم لیبر",
                "منقبض کننده های رحمی پیشگیرانه",
                "استفاده از منقبض کننده های رحمی برای جلوگیری از خونریزی پس از زایمان (PPH) در مرحله سوم زایمان برای تمامی زایمان ها توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType4(
                2,
                "مرحله سوم لیبر",
                "منقبض کننده های رحمی پیشگیرانه",
                "اکسی توسین داروی منقبض کننده ی رحمی منتخب برای جلوگیری از خونریزی پس از زایمان است",
                "توصیه شده"
            ),
            SuggestionType4(
                3,
                "مرحله سوم لیبر",
                "منقبض کننده های رحمی پیشگیرانه",
                "در مراکزی که اکسی توسین در دسترس نیست، استفاده از دیگر منقبض کننده های رحمی تزریقی (در صورت مناسب بودن، ارگومترین، متیل ارگومترین یا ترکیب ثابت داروی اکسي توسين و ارگومترین) یا میزوپروستول خوراکی (600 میکروگرم) توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType4(
                4,
                "مرحله سوم لیبر",
                "کلامپ تاخیری بند ناف",
                "کلامپ تاخیری بند ناف برای بهبود پیامدهای سلامتی مادری، نوزادی و تغذیه ای توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType4(
                5,
                "مرحله سوم لیبر",
                "کشش کنترل شده بند ناف",
                "در مراکزی که عاملین زایمانی ماهر در دسترس هستند، کشش کنترل شده بند ناف توصیه می شود اگر زن خون کمی در طول مرحله سوم لیبر از دست داده باشد",
                "توصیه شده"
            ),
            SuggestionType4(
                6,
                "مرحله سوم لیبر",
                "ماساژ رحمی",
                "ماساژ مداوم رحمی به عنوان یک مداخله برای جلوگیری از خونریزی پس از زایمان در زنانی که اکسی توسین پیشگیرانه دریافت کرده اند، توصیه نمی شود",
                "توصیه نشده"
            ),
        )
    }


    private fun commitSuggestionType5(): List<SuggestionType5> {

        return listOf(

            SuggestionType5(
                1,
                "مراقبت نوزادی",
                "ساکشن روتین دهان و بینی",
                "نوزادان متولد شده با مایع آمنیوتیک روشن که پس از تولد خودبخود شروع به تنفس می کنند، ساکشن دهان و بینی نباید انجام شود",
                "توصیه نشده"
            ),
            SuggestionType5(
                2,
                "مراقبت نوزادی",
                "تماس پوست با پوست",
                "نوزادان بدون عارضه باید در ساعت اول برای جلوگیری از هیپوترمی و ترویج تغذیه با شیر مادر در تماس پوست با پوست با مادران خود نگه داشته شوند",
                "توصیه شده"
            ),
            SuggestionType5(
                3,
                "مراقبت نوزادی",
                "شیردهی",
                "همه نوزادان، از جمله نوزادان کم وزن (LBW) که قادر به شیر خوردن هستند باید در اسرع وقت پس از تولد هنگامی که از نظر بالینی پایدار هستند و مادر و کودک هر دو آماده است، روی سینه گذاشته شوند",
                "توصیه شده"
            ),
            SuggestionType5(
                4,
                "مراقبت نوزادی",
                "پیشگیری از بیماری هموراژیک با استفاده از ویتامین K",
                "به همه نوزادان پس از تولد باید یک میلی گرم ویتامین K به صورت عضلانی داده شود",
                "توصیه شده"
            ),
            SuggestionType5(
                5,
                "مراقبت نوزادی",
                "حمام کردن و دیگر مراقبتهای نوزادی بلافاصله پس از زایمان",
                "حمام کردن باید تا 24 ساعت پس از تولد به تاخیر انداخته شود. اگر این به دلایل فرهنگی ممکن نیست، حمام کردن باید حداقل شش ساعت به تعویق بیفتد. لباس مناسب کودک متناسب با دمای محیط توصیه می شود. مادر و کودک نباید از هم جدا شود و باید تمام ساعات شبانه روز در یک اتاق باشند",
                "توصیه شده"
            )
        )
    }

    private fun commitSuggestionType6(): List<SuggestionType6> {

        return listOf(

            SuggestionType6(
                1,
                "مراقبتهای مادری پس از زایمان",
                "ارزیابی تونوسیته رحمی",
                "ارزیابی تونوسیته رحمی بعد از زایمان برای تشخیص زود هنگام آتونی رحمی برای همه زنان توصیه می شود",
                "توصیه شده"
            ),
            SuggestionType6(
                2,
                "مراقبتهای مادری پس از زایمان",
                "آنتی بیوتیک برای زایمان های بی عارضه",
                "آنتی بیوتیک پیشگیرانه روتین برای زنان با زایمان طبیعی بدون عارضه توصیه نمی شود",
                "توصیه نشده"
            ),
            SuggestionType6(
                3,
                "مراقبتهای مادری پس از زایمان",
                "آنتی بیوتیک روتین برای اپی زیاتومی",
                "آنتی بیوتیک روتین پیشگیرانه برای زنان با اپی زیاتومی پیشنهاد نمی شود",
                "توصیه نشده"
            ),
            SuggestionType6(
                4,
                "مراقبتهای مادری پس از زایمان",
                "ارزیابی روتین مادر پس از زایمان",
                "همه زنان باید به طور منظم از نظر خونریزی واژینال، انقباض رحمی، ارتفاع رحم، دما و ضربان قلب را به طور مرتب در طول 24 ساعت اول پس از زایمان ارزیابی شوند. فشار خون باید کمی بعد از زایمان اندازه گیری شود. اگر طبیعی باشد، اندازه گیری فشار خون دوم باید در عرض شش ساعت انجام شود. حجم ادرار باید ظرف شش ساعت ثبت شود",
                "توصیه شده"
            ),
            SuggestionType6(
                5,
                "مراقبتهای مادری پس از زایمان",
                "ترخیص به دنبال زایمان طبیعی بی عارضه",
                "پس از زایمان طبیعی بدون عارضه در یک مرکز بهداشتی، مادران و نوزادان سالم باید در این مرکز حداقل 24 ساعت پس از تولد مراقبت شوند",
                "توصیه شده"
            )
        )
    }

}