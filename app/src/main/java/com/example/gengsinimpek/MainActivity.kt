package com.example.gengsinimpek

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val about_page: ImageView = findViewById(R.id.about_page)
        about_page.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val characterRv : RecyclerView = findViewById(R.id.character_rv)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val characterAdapter = CharacterAdapter(ArrayCharacter)
        characterRv.setHasFixedSize(true)
        characterRv.layoutManager = layoutManager
        characterRv.adapter = characterAdapter
    }

    val ArrayCharacter : ArrayList<CharacterModel>get(){
        val array_character = ArrayList<CharacterModel>()

        val albedo = CharacterModel()
        albedo.url = "https://genshin-impact.fandom.com/wiki/Albedo"
        albedo.icon = "https://static.wikia.nocookie.net/gensin-impact/images/3/30/Albedo_Icon.png/revision/latest?cb=20210213163457"
        albedo.wish = "https://static.wikia.nocookie.net/gensin-impact/images/8/8f/Albedo_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201223021636"
        albedo.item = "https://static.wikia.nocookie.net/gensin-impact/images/d/d2/Albedo_Item.png/revision/latest?cb=20210621072651"
        albedo.name = "Albedo"
        albedo.quality = 5
        albedo.title = "Kreideprinz"
        albedo.birthday = "September 13th"
        albedo.constellation = "Princeps Cretaceus"
        albedo.element = getString(R.string.geo)
        albedo.weapon = getString(R.string.sword)
        albedo.region = getString(R.string.mondstadt)
        albedo.detail = "A synthetic human made by the alchemist Rhinedottir, the mysterious Albedo is the Chief Alchemist and Captain of the Investigation Team of the Knights of Favonius."

        val alhaitham = CharacterModel()
        alhaitham.url = "https://genshin-impact.fandom.com/wiki/Alhaitham"
        alhaitham.icon = "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest?cb=20230118023048"
        alhaitham.wish = "https://static.wikia.nocookie.net/gensin-impact/images/9/90/Alhaitham_Wish.png/revision/latest/scale-to-width-down/1000?cb=20230118023258"
        alhaitham.item = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Alhaitham_Item.png/revision/latest?cb=20230118023142"
        alhaitham.name = "Alhaitham"
        alhaitham.quality = 5
        alhaitham.title = "Admonishing Instruction"
        alhaitham.birthday = "February 10th"
        alhaitham.constellation = "Vultur Volans"
        alhaitham.element = getString(R.string.dendro)
        alhaitham.weapon = getString(R.string.sword)
        alhaitham.region = getString(R.string.sumeru)
        alhaitham.detail = "Alhaitham is a member of the Haravatat of the Sumeru Akademiya and the Akademiya's Scribe, responsible for documenting their findings and drafting ordinances."

        val amber = CharacterModel()
        amber.url = "https://genshin-impact.fandom.com/wiki/Amber"
        amber.icon = "https://static.wikia.nocookie.net/gensin-impact/images/7/75/Amber_Icon.png/revision/latest?cb=20210213161233"
        amber.wish = "https://static.wikia.nocookie.net/gensin-impact/images/0/02/Amber_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223905"
        amber.item = "https://static.wikia.nocookie.net/gensin-impact/images/2/2a/Amber_Item.png/revision/latest?cb=20210621072652"
        amber.name = "Amber"
        amber.quality = 4
        amber.title = "Gliding Champion"
        amber.birthday = "August 10th"
        amber.constellation = "Lepus"
        amber.element = getString(R.string.pyro)
        amber.weapon = getString(R.string.bow)
        amber.region = getString(R.string.mondstadt)
        amber.detail = "A young, passionate archer who is always ready to help anyone in need. She is the only Outrider of the Knights of Favonius and takes her duties very seriously. Although she can be a bit clumsy and forgetful at times, her cheerful personality and optimistic outlook on life make her a beloved member of the community."

        val barbara = CharacterModel()
        barbara.url = "https://genshin-impact.fandom.com/wiki/Barbara"
        barbara.icon = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Barbara_Icon.png/revision/latest?cb=20230302072845"
        barbara.wish = "https://static.wikia.nocookie.net/gensin-impact/images/1/1a/Barbara_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223906"
        barbara.item = "https://static.wikia.nocookie.net/gensin-impact/images/d/d4/Barbara_Item.png/revision/latest?cb=20210621072654"
        barbara.name = "Barbara"
        barbara.quality = 4
        barbara.title = "Shining Idol"
        barbara.birthday = "July 5th"
        barbara.constellation = "Crater"
        barbara.element = getString(R.string.hydro)
        barbara.weapon = getString(R.string.catalyst)
        barbara.region = getString(R.string.mondstadt)
        barbara.detail = "She is the deaconess of the Church of Favonius and a prominent \"idol\" after learning about them from the intrepid adventurer Alice. She is also the younger sister of the Acting Grand Master Jean."

        val beidou = CharacterModel()
        beidou.url = "https://genshin-impact.fandom.com/wiki/Beidou"
        beidou.icon = "https://static.wikia.nocookie.net/gensin-impact/images/e/e1/Beidou_Icon.png/revision/latest?cb=20210214011821"
        beidou.wish = "https://static.wikia.nocookie.net/gensin-impact/images/3/33/Beidou_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223906"
        beidou.item = "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Beidou_Item.png/revision/latest?cb=20210621072655"
        beidou.name = "Beidou"
        beidou.quality = 4
        beidou.title = "Uncrowned Lord of the Ocean"
        beidou.birthday = "February 14th"
        beidou.constellation = "Victor Mare"
        beidou.element = getString(R.string.electro)
        beidou.weapon = getString(R.string.claymore)
        beidou.region = getString(R.string.liyue)
        beidou.detail = "She is the captain of The Crux, a renowned crew in Liyue. Besides her capabilities as a fleet captain and her immense strength, many in Liyue know her for her lack of fear towards the Tianquan of the Liyue Qixing, Ningguang — a trait that the other appreciates, yet grows irritated by."

        val bennett = CharacterModel()
        bennett.url = "https://genshin-impact.fandom.com/wiki/Bennett"
        bennett.icon = "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Bennett_Icon.png/revision/latest?cb=20210214011829"
        bennett.wish = "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Bennett_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223907"
        bennett.item = "https://static.wikia.nocookie.net/gensin-impact/images/0/0d/Bennett_Item.png/revision/latest?cb=20210621072656"
        bennett.name = "Bennett"
        bennett.quality = 4
        bennett.title = "Trial by Fire"
        bennett.birthday = "February 29th"
        bennett.constellation = "Rota Calamitas"
        bennett.element = getString(R.string.pyro)
        bennett.weapon = getString(R.string.sword)
        bennett.region = getString(R.string.mondstadt)
        bennett.detail = "An orphan discovered by an elderly adventurer as a baby, Bennett was raised in Mondstadt's Adventurers' Guild. He is the one and only member of \"Benny's Adventure Team,\" as everyone else left the team after experiencing the constant misfortune that follows him."

        val cyno = CharacterModel()
        cyno.url = "https://genshin-impact.fandom.com/wiki/Cyno"
        cyno.icon = "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Cyno_Icon.png/revision/latest?cb=20220928023453"
        cyno.wish = "https://static.wikia.nocookie.net/gensin-impact/images/1/1a/Cyno_Wish.png/revision/latest/scale-to-width-down/1000?cb=20220928034246"
        cyno.item = "https://static.wikia.nocookie.net/gensin-impact/images/3/38/Cyno_Item.png/revision/latest?cb=20220928023548"
        cyno.name = "Cyno"
        cyno.quality = 5
        cyno.title = "Judicator of Secrets"
        cyno.birthday = "June 23rd"
        cyno.constellation = "Luupus Aureus"
        cyno.element = getString(R.string.electro)
        cyno.weapon = getString(R.string.polearm)
        cyno.region = getString(R.string.sumeru)
        cyno.detail = "As the General Mahamatra, Cyno leads the Matra and strikes fear into the hearts of researchers of the Sumeru Akademiya."

        val diluc = CharacterModel()
        diluc.url = "https://genshin-impact.fandom.com/wiki/Diluc"
        diluc.icon = "https://static.wikia.nocookie.net/gensin-impact/images/3/3d/Diluc_Icon.png/revision/latest?cb=20210213163824"
        diluc.wish = "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Diluc_Wish.png/revision/latest/scale-to-width-down/1000?cb=20211226014118"
        diluc.item = "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Diluc_Item.png/revision/latest?cb=20210621072659"
        diluc.name = "Diluc"
        diluc.quality = 5
        diluc.title = "The Dark Side of Dawn"
        diluc.birthday = "April 30th"
        diluc.constellation = "Noctua"
        diluc.element = getString(R.string.pyro)
        diluc.weapon = getString(R.string.claymore)
        diluc.region = getString(R.string.mondstadt)
        diluc.detail = "Born into the affluent Ragnvindr Clan, Diluc is the current owner of the Dawn Winery and a nobleman of high esteem in Mondstadt. While a past incident caused him to split ways with the Knights of Favonius, he continues to protect Mondstadt in his own way."

        val diona = CharacterModel()
        diona.url = "https://genshin-impact.fandom.com/wiki/Diona"
        diona.icon = "https://static.wikia.nocookie.net/gensin-impact/images/4/40/Diona_Icon.png/revision/latest?cb=20220210035554"
        diona.wish = "https://static.wikia.nocookie.net/gensin-impact/images/a/a1/Diona_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223910"
        diona.item = "https://static.wikia.nocookie.net/gensin-impact/images/a/aa/Diona_Item.png/revision/latest?cb=20210621072701"
        diona.name = "Diona"
        diona.quality = 4
        diona.title = "Kätzlein Cocktail"
        diona.birthday = "January 18th"
        diona.constellation = "Feles"
        diona.element = getString(R.string.cryo)
        diona.weapon = getString(R.string.bow)
        diona.region = getString(R.string.mondstadt)
        diona.detail = "Despite being a bartender at the Cat's Tail, she loathes alcohol and will stop at nothing to ruin Mondstadt's wine industry — a feat easier said than done when her patrons absolutely love her drinks. She is the daughter of Draff, a hunter in Springvale."

        val eula = CharacterModel()
        eula.url = "https://genshin-impact.fandom.com/wiki/Eula"
        eula.icon = "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Eula_Icon.png/revision/latest?cb=20210511040616"
        eula.wish = "https://static.wikia.nocookie.net/gensin-impact/images/7/7c/Eula_Item.png/revision/latest?cb=20210621072702"
        eula.item = "https://static.wikia.nocookie.net/gensin-impact/images/4/49/Eula_Wish.png/revision/latest/scale-to-width-down/1000?cb=20210519023057"
        eula.name = "Eula"
        eula.quality = 5
        eula.title = "Dance of the Shimmering Wave"
        eula.birthday = "October 25th"
        eula.constellation = "Aphros Delos"
        eula.element = getString(R.string.cryo)
        eula.weapon = getString(R.string.claymore)
        eula.region = getString(R.string.mondstadt)
        eula.detail = "Although a descendant of the infamous and tyrannical Lawrence Clan, Eula severed her ties with the clan and became the captain of the Reconnaissance Company with the Knights of Favonius."

        val ganyu = CharacterModel()
        ganyu.url = "https://genshin-impact.fandom.com/wiki/Ganyu"
        ganyu.icon = "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Ganyu_Icon.png/revision/latest?cb=20210213162851"
        ganyu.wish = "https://static.wikia.nocookie.net/gensin-impact/images/f/f5/Ganyu_Wish.png/revision/latest/scale-to-width-down/1000?cb=20210416125317"
        ganyu.item = "https://static.wikia.nocookie.net/gensin-impact/images/e/ea/Ganyu_Item.png/revision/latest?cb=20210621072705"
        ganyu.name = "Ganyu"
        ganyu.quality = 5
        ganyu.title = "Plenilune Gaze"
        ganyu.birthday = "December 2nd"
        ganyu.constellation = "Sinae Unicornis"
        ganyu.element = getString(R.string.cryo)
        ganyu.weapon = getString(R.string.bow)
        ganyu.region = getString(R.string.liyue)
        ganyu.detail = "She is a half-qilin Adeptus under contract with the Geo Archon Morax and serves as the general secretary of the Liyue Qixing."

        val hu_tao = CharacterModel()
        hu_tao.url = "https://genshin-impact.fandom.com/wiki/Hu_Tao"
        hu_tao.icon = "https://static.wikia.nocookie.net/gensin-impact/images/e/e9/Hu_Tao_Icon.png/revision/latest?cb=20210228210611"
        hu_tao.wish = "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Hu_Tao_Wish.png/revision/latest/scale-to-width-down/1000?cb=20210607210121"
        hu_tao.item = "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Hu_Tao_Item.png/revision/latest?cb=20210621072706"
        hu_tao.name = "Hu Tao"
        hu_tao.quality = 5
        hu_tao.title = "Fragrance in Thaw"
        hu_tao.birthday = "July 15th"
        hu_tao.constellation = "Papilio Charontis"
        hu_tao.element = getString(R.string.pyro)
        hu_tao.weapon = getString(R.string.polearm)
        hu_tao.region = getString(R.string.liyue)
        hu_tao.detail = "Hu Tao's antics and eccentricity belies her role as the 77th Director of the Wangsheng Funeral Parlor and her talent as a poet. Nevertheless, she treats the parlor's operations with utmost importance, and holds funeral ceremonies with the highest dignity and solemnity."

        val kaedehara_kazuha = CharacterModel()
        kaedehara_kazuha.url = "https://genshin-impact.fandom.com/wiki/Kaedehara_Kazuha"
        kaedehara_kazuha.icon = "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Kaedehara_Kazuha_Icon.png/revision/latest?cb=20210623063513"
        kaedehara_kazuha.wish = "https://static.wikia.nocookie.net/gensin-impact/images/1/1e/Kaedehara_Kazuha_Wish.png/revision/latest/scale-to-width-down/1000?cb=20210629114955"
        kaedehara_kazuha.item = "https://static.wikia.nocookie.net/gensin-impact/images/1/18/Kaedehara_Kazuha_Item.png/revision/latest?cb=20210629205730"
        kaedehara_kazuha.name = "Kaedehara Kazuha"
        kaedehara_kazuha.quality = 5
        kaedehara_kazuha.title = "Scarlet Leaves Pursue Wild Waves"
        kaedehara_kazuha.birthday = "October 29th"
        kaedehara_kazuha.constellation = "Acer Palmatum"
        kaedehara_kazuha.element = getString(R.string.anemo)
        kaedehara_kazuha.weapon = getString(R.string.sword)
        kaedehara_kazuha.region = getString(R.string.inazuma)
        kaedehara_kazuha.detail = "A wandering samurai of the once-famed Kaedehara Clan with an ability to read the sounds of nature, Kazuha is a temporary crewmember of The Crux. Despite being burdened by the many happenings of his past, Kazuha still maintains an easygoing disposition."

        val kamisato_ayaka = CharacterModel()
        kamisato_ayaka.url = "https://genshin-impact.fandom.com/wiki/Kamisato_Ayato"
        kamisato_ayaka.icon = "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Kamisato_Ayaka_Icon.png/revision/latest?cb=20211221231648"
        kamisato_ayaka.wish = "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Kamisato_Ayaka_Wish.png/revision/latest/scale-to-width-down/1000?cb=20210721040743"
        kamisato_ayaka.item = "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Kamisato_Ayaka_Item.png/revision/latest?cb=20210721040744"
        kamisato_ayaka.name = "Kamisato Ayaka"
        kamisato_ayaka.quality = 5
        kamisato_ayaka.title = "Frostflake Heron"
        kamisato_ayaka.birthday = "September 28th"
        kamisato_ayaka.constellation = "Grus Nivis"
        kamisato_ayaka.element = getString(R.string.cryo)
        kamisato_ayaka.weapon = getString(R.string.sword)
        kamisato_ayaka.region = getString(R.string.inazuma)
        kamisato_ayaka.detail = "She is in charge of the internal and external affairs of the Kamisato Clan and is the younger sister of Kamisato Ayato. Beautiful, dignified, and noble, Ayaka has earned the title Shirasagi Himegimi and is considered a model of perfection in Inazuma."

        val klee = CharacterModel()
        klee.url = "https://genshin-impact.fandom.com/wiki/Klee"
        klee.icon = "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Klee_Icon.png/revision/latest?cb=20210214011911"
        klee.wish = "https://static.wikia.nocookie.net/gensin-impact/images/f/f4/Klee_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223923"
        klee.item = "https://static.wikia.nocookie.net/gensin-impact/images/7/78/Klee_Item.png/revision/latest?cb=20210621072712"
        klee.name = "Klee"
        klee.quality = 5
        klee.title = "Fleeing Sunlight"
        klee.birthday = "July 27th"
        klee.constellation = "Trifolium"
        klee.element = getString(R.string.pyro)
        klee.weapon = getString(R.string.catalyst)
        klee.region = getString(R.string.mondstadt)
        klee.detail = "The daughter of the intrepid and often quite destructive adventurer Alice, Klee takes after her mother in many ways, much to the dismay of the Knights of Favonius whom she has been entrusted to."

        val layla = CharacterModel()
        layla.url = "https://genshin-impact.fandom.com/wiki/Layla"
        layla.icon = "https://static.wikia.nocookie.net/gensin-impact/images/1/1a/Layla_Icon.png/revision/latest?cb=20221118140544"
        layla.wish = "https://static.wikia.nocookie.net/gensin-impact/images/e/ea/Layla_Wish.png/revision/latest/scale-to-width-down/1000?cb=20221124092305"
        layla.item = "https://static.wikia.nocookie.net/gensin-impact/images/2/21/Layla_Item.png/revision/latest?cb=20221124092625"
        layla.name = "Layla"
        layla.quality = 4
        layla.title = "Fantastical Evening Star"
        layla.birthday = "December 19th"
        layla.constellation = "Luscinia"
        layla.element = getString(R.string.cryo)
        layla.weapon = getString(R.string.sword)
        layla.region = getString(R.string.sumeru)
        layla.detail = "She is a student in the Rtawahist Darshan, specializing in Theoretical Astrology. Chronically sleep-deprived and of poor health as a result, Layla believes that \"The Stars' Blessing\" is the reason she wakes from sleepwalking to find her papers fully completed."

        val noelle = CharacterModel()
        noelle.url = "https://genshin-impact.fandom.com/wiki/Noelle"
        noelle.icon = "https://static.wikia.nocookie.net/gensin-impact/images/8/8e/Noelle_Icon.png/revision/latest?cb=20210214011929"
        noelle.wish = "https://static.wikia.nocookie.net/gensin-impact/images/9/90/Noelle_Wish.png/revision/latest/scale-to-width-down/1000?cb=20201119223932"
        noelle.item = "https://static.wikia.nocookie.net/gensin-impact/images/5/5b/Noelle_Item.png/revision/latest?cb=20210621072719"
        noelle.name = "Noelle"
        noelle.quality = 4
        noelle.title = "Chivalric Blossom"
        noelle.birthday = "March 21st"
        noelle.constellation = "Parma Cordis"
        noelle.element = getString(R.string.geo)
        noelle.weapon = getString(R.string.claymore)
        noelle.region = getString(R.string.mondstadt)
        noelle.detail = "Extremely strong and reliable, Noelle is considered to be \"the maid of all maids\" in the Knights of Favonius, with many thinking she has the ability to be everywhere all at once. She is stubborn, however, and willing to unnecessarily endanger her life at any moment to help someone. She has tried many times to join the ranks of the Knights of Favonius to accomplish her dream of becoming a full-fledged knight, but has fallen short every time so far."

        array_character.add(albedo)
        array_character.add(alhaitham)
        array_character.add(amber)
        array_character.add(barbara)
        array_character.add(beidou)
        array_character.add(bennett)
        array_character.add(cyno)
        array_character.add(diluc)
        array_character.add(diona)
        array_character.add(eula)
        array_character.add(ganyu)
        array_character.add(hu_tao)
        array_character.add(kaedehara_kazuha)
        array_character.add(kamisato_ayaka)
        array_character.add(klee)
        array_character.add(layla)
        array_character.add(noelle)

        return array_character
    }
}