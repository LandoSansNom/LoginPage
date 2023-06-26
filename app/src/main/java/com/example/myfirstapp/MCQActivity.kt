package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup

class MCQActivity : AppCompatActivity() {

    private lateinit var imgValidation: ImageView
    private lateinit var btnSubmit: Button
    private lateinit var radioGroup: RadioGroup
    private lateinit var chkbox1: CheckBox
    private lateinit var chkbox2: CheckBox
    private lateinit var chkbox3: CheckBox
    private lateinit var chkbox4: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mcqactivity)

        btnSubmit = findViewById(R.id.submitBtn)
        radioGroup = findViewById(R.id.optionRadioGroup)
        chkbox1 = findViewById(R.id.option1CheckBox)
        chkbox2 = findViewById(R.id.option2CheckBox)
        chkbox3 = findViewById(R.id.option3CheckBox)
        chkbox4 = findViewById(R.id.option4CheckBox)
        imgValidation = findViewById(R.id.imgValidation)

        btnSubmit.setOnClickListener{
            val radioButtonID: Int = radioGroup.checkedRadioButtonId
            val radioButton: RadioButton = findViewById(radioButtonID)
            val selectedText: String = radioButton.text.toString()
            val hasSelectedGoodAnswerForQuestionOne: Boolean = (selectedText == "Paolo Coelho")
            val hasSelectedGoodAnswersForQuestionTwo: Boolean = (!chkbox1.isChecked && !chkbox2.isChecked && chkbox3.isChecked && chkbox4.isChecked)

            if(hasSelectedGoodAnswerForQuestionOne && hasSelectedGoodAnswersForQuestionTwo){
                imgValidation.setImageResource(R.drawable.greencheck)
            }else{
                imgValidation.setImageResource(R.drawable.redcross)
            }

            finish()
            startActivity(intent)
        }

    }
}