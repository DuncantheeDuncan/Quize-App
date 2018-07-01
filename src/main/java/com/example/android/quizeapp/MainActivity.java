package com.example.android.quizeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*each right question is equal to 2 points
     * NB**** IF YOU CHOOSE TWO CORRECT ANSWERS AND LEAVE ONE UNCHECKED YOU
      * WONT GET A POINT IN CHECKBOXES*/
//name field
    EditText name_space_field;
    //Question 1
    CheckBox np_nc,tran_orangeRiver_colony;
    // Question 2
    CheckBox both_zuma_robberts,Ramaphosa_montlanthe_Christian,klerk_Mbeki_Mandela;
    // Question 3
    CheckBox Trans_courge,diver_daring;
    //Question 4
   RadioButton nelson_mandela;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void checkAnswers (View view){
        /*we trying to create the variable to hold each answers
        * for now we will us this method *wink*/


    /*i think we going to kill a cat this way today
    * im going to create a variable that i will use randomly
    * hope it works*/
       //_____________________________________________________________________________________
    /*we will try to deal with each question at once
     * Question 1
     * ###THE CORRECT ANSWER IS choice 1 and choice 3###
     *
     * */
    int question1_answer_score;

    /*we going to use  boolean true or false since it a CheckBox */
    boolean question1_answer1;
    boolean question1_answer2;

    np_nc = (CheckBox)this.findViewById(R.id.cape_colony__natal_colony);
    tran_orangeRiver_colony =(CheckBox)this.findViewById(R.id.transval_orange_river_colony);
    question1_answer1 = np_nc.isChecked();
    question1_answer2 = tran_orangeRiver_colony.isChecked();

    if (question1_answer1 && question1_answer2){
        question1_answer_score = 4;
    }else {
        question1_answer_score = 0;
    }

    //______________________________________________________________________________________

    /*we will try to deal with each question at once
     * Question 2
     * ###THE CORRECT ANSWERS  ARE CHOICE 1 CHOICE4 CHOICE5 ###
     *
     * */
        int question2_answer_score;
    /*we going to use  boolean true or false since it a CheckBox */
    boolean question2_answer1,question2_answer2,question2_answer3;
    both_zuma_robberts =(CheckBox)this.findViewById(R.id.both_zuma_robberts);
    Ramaphosa_montlanthe_Christian =(CheckBox)this.findViewById(R.id.Ramaphosa_montlanthe_Christian);
    klerk_Mbeki_Mandela =(CheckBox)this.findViewById(R.id.klerk_Mbeki_Mandela);

    question2_answer1 = both_zuma_robberts.isChecked();
    question2_answer2 = Ramaphosa_montlanthe_Christian.isChecked();
    question2_answer3 = klerk_Mbeki_Mandela.isChecked();

    if (question2_answer1 && question2_answer2 && question2_answer3){
        question2_answer_score = 6 ;
    }else {
        question2_answer_score = 0;
    }

    //______________________________________________________________________________________

    /*we will try to deal with each question at once
     * Question 3
     * ###THE CORRECT ANSWERS  ARE CHOICE 1 CHOICE4 CHOICE5 ###
     *
     * */
    int question3_answer_score;
    /*we going to use  boolean true or false since it a CheckBox */

    boolean question3_answer1,question3_answer2;
    diver_daring =(CheckBox)this.findViewById(R.id.diver_daring);
    Trans_courge =(CheckBox)this.findViewById(R.id.Trans_courge);

    question3_answer1 = diver_daring.isChecked();
    question3_answer2 = Trans_courge.isChecked();

    if (question3_answer1 && question3_answer2){
        question3_answer_score = 4 ;
    }else {
        question3_answer_score = 0;
    }


//_______________________________________________________________________________
    /*we will try to deal with each question at once
    * Question 6
    * ###THE CORRECT ANSWER IS NELSON MANDELA###
    * CHOICE 3
    * */
    int question4_answer_score;

    /*we going to use  boolean true or false since it a radio button*/
    boolean question6_answer;

    nelson_mandela = (RadioButton) this.findViewById(R.id.N_mandela);
    question6_answer = nelson_mandela.isChecked();
    if (question6_answer){
        question4_answer_score = 2;

    }else {
        question4_answer_score = 0;
    }
//_____________________________________________________________________________________________________________


String Name ;
    name_space_field = (EditText)this.findViewById(R.id.name_space_field);
    Name = name_space_field.getText().toString().toLowerCase();

//_____________________________________________________________________________________________________________
    /*Total score by the participant*/
    int total_score;
    total_score = question1_answer_score + question2_answer_score + question3_answer_score  +question4_answer_score;

    if (total_score == 16){

        Toast.makeText(this, Name+"\nperfect you scored your self: "+total_score+"out of 16",Toast.LENGTH_LONG).show();
    }else if(total_score >= 8) {
        Toast.makeText(this, Name+"\nNot bad at all  \n you scored half marks "+ total_score+"out of 16",Toast.LENGTH_LONG).show();

    }else{
        Toast.makeText(this,Name +"\nBetter luck next time \n you scored  "+ total_score+"out of 16 ",Toast.LENGTH_LONG).show();

    }
//_____________________________________________________________________________________________________________

}

}
