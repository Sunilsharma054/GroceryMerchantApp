package com.tilly.grocerymerchantapp.Register;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.tilly.grocerymerchantapp.Login.LoginActivity;
import com.tilly.grocerymerchantapp.Models.Register_Model.MerchantRegister;
import com.tilly.grocerymerchantapp.R;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {
    Button cirRegisterButton;
    Dialog listDialog2;




    EditText  m_name, m_email_address, m_mobile_number, m_enter_Password, m_re_Enter_Password;
    public String merc_name, merc_email_address, merc_mobile_number, merc_enter_Password, merc_re_Enter_Password;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    listDialog2=new Dialog(this, R.style.MyAlertDialogTheme);
        changeStatusBarColor();
        cirRegisterButton=findViewById(R.id.cirRegisterButton);
        cirRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createdialog();

            }
        });
    }

    private void createdialog() {

        LayoutInflater li1 = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v1 = li1.inflate(R.layout.register_cust_dialog, null, false);

        listDialog2.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.FILL_PARENT);
        listDialog2.setContentView(v1);
        listDialog2.setCancelable(true);

        m_name = (EditText)listDialog2.findViewById(R.id.merch_name);
        m_email_address = (EditText)listDialog2.findViewById(R.id.merch_email);
        m_mobile_number = (EditText)listDialog2.findViewById(R.id.merch_mobile);
        m_enter_Password =(EditText)listDialog2.findViewById(R.id.merch_password);
        m_re_Enter_Password = (EditText)listDialog2.findViewById(R.id.merch_c_password);
        TextView btn_cancel = listDialog2.findViewById(R.id.cancel);
        TextView btn_save = listDialog2.findViewById(R.id.proceed);
        listDialog2.show();
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listDialog2.dismiss();
            }
        });

        btn_save.setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    merc_name = m_name.getText().toString();
                    merc_email_address =m_email_address.getText().toString();
                    merc_mobile_number =m_mobile_number.getText().toString();
                    merc_enter_Password = m_enter_Password.getText().toString();
                    merc_re_Enter_Password =m_re_Enter_Password.getText().toString();
                    listDialog2.dismiss();
//              Intent intent =new Intent(Register.this, LoginActivity.class);
//              startActivity(intent);
            }
        });


//        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(this);
//        View view = layoutInflaterAndroid.inflate(R.layout.testing, null);
//        AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(this);
//        alertDialogBuilderUserInput.setView(view);

    }



    boolean isEmpty(EditText text)
    {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    private void checkDataInput() {
        if(isEmpty(m_name)){
            m_name.setError("Please enter merchant name");
            //Toast.makeText(this, "Please enter the name", Toast.LENGTH_SHORT).show();
        }
        if(isEmpty(m_email_address)){
            m_email_address.setError("Please enter email  address");
            //Toast.makeText(this, "Please enter Restaurant Name name", Toast.LENGTH_SHORT).show();
        }

        if(isEmpty(m_mobile_number)){
            m_mobile_number.setError("Please enter the mobile number");
            //Toast.makeText(this, "Please enter Restaurant Name name", Toast.LENGTH_SHORT).show();
        }
        if(isEmpty(m_enter_Password)){
            m_enter_Password.setError("Please enter password");
        }

        if(isEmpty(m_re_Enter_Password)){
            m_re_Enter_Password.setError("Please enter conform password");
        }
    }
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }
    }

    public void onLoginClick(View view){
        startActivity(new Intent(this,LoginActivity.class));
        //overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }

}
