package com.boussalh.quizapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.boussalh.quizapp.Domain.QuestionModel
import com.boussalh.quizapp.R
import com.boussalh.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        binding.apply {

            singlebtn.setOnClickListener{
                val intent = Intent(this@MainActivity,QuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList()))
                startActivity(intent)
            }
            bottomMenu.setItemSelected(R.id.home)
            bottomMenu.setOnItemSelectedListener {
                if (it == R.id.Board){
                    startActivity(Intent(this@MainActivity,LeaderActivity::class.java))
                }
            }
        }
    }

    private fun questionList() : MutableList<QuestionModel>{
        val question:MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                1,
                "Which planet it the larget planet in the solar system?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_1",
                null
            )
        )
        question.add(
            QuestionModel(
                2,
                "Which country is the larget country in the world by land area?",
                "Russia",
                "Canada",
                "United State",
                "China",
                "a",
                5,
                "q_2",
                null
            )
        )
        question.add(
            QuestionModel(
                3,
                "Which of the following substances is used as an anti-canser medication in the medical world?",
                "Cheese",
                "Lemon juice",
                "Cannabis",
                "Pasplum",
                "c",
                5,
                "q_3",
                null
            )
        )
        question.add(
            QuestionModel(
                4,
                "Which moon in the Earth's solar system has an atmospher?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus moon",
                "None of the above",
                "d",
                5,
                "q_4",
                null
            )
        )
        question.add(
            QuestionModel(
                5,
                "Which of the following symbols represents the chemical element with the atomic number 6?",
                "O",
                "H",
                "C",
                "N",
                "c",
                5,
                "q_5",
                null
            )
        )
        question.add(
            QuestionModel(
                6,
                "Who is credited with inventing as we know it today?",
                "Shakespeare",
                "Arthur Miller",
                "Ashkouri",
                "Ancient Greeks",
                "d",
                5,
                "q_6",
                null
            )
        )
        question.add(
            QuestionModel(
                7,
                "Which ocean is the larget ocean in the world?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                5,
                "q_7",
                null
            )
        )
        question.add(
            QuestionModel(
                8,
                "Which relegions are among the most practiced relegions in the world?",
                "Islam, Christianity, Judainsm",
                "Buddhism, Minduism, Sikhism",
                "Zoroastrianism, Brahmanism, Yasdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                5,
                "q_8",
                null
            )
        )
        question.add(
            QuestionModel(
                9,
                "In which continent are the most independent countries located?",
                "Asia",
                "Europe",
                "Africa",
                "America",
                "c",
                5,
                "q_9",
                null
            )
        )
        question.add(
            QuestionModel(
                10,
                "which ocean has the greatest average depth?",
                "Pasific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Southern Ocean",
                "d",
                5,
                "q_10",
                null
            )
        )
        return question
    }
}