package com.rental.da4a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationFragment extends Fragment {

    static Pattern emailPattern = Pattern.compile("[a-zA-Z0-9[!#$%&'()*+,/\\-_\\.\"]]+@[a-zA-Z0-9[!#$%&'()*+,/\\-_\"]]+\\.[a-zA-Z0-9[!#$%&'()*+,/\\-_\"\\.]]+");
    public static boolean isValidEmail(String email)
    {
        Matcher m = emailPattern.matcher(email);
        return !m.matches();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_registration, container, false);

        final EditText ed_email = v.findViewById(R.id.ed_email);
        final EditText ed_password = v.findViewById(R.id.ed_password);
        final EditText ed_repeat_password = v.findViewById(R.id.ed_repeat_password);
        final EditText ed_city = v.findViewById(R.id.ed_city);
        final EditText ed_phone = v.findViewById(R.id.ed_phone);

        final TextView tv_email = v.findViewById(R.id.tv_email);
        final TextView tv_password = v.findViewById(R.id.tv_password);
        final TextView tv_repeat_password = v.findViewById(R.id.tv_repeat_password);

        Button registration = v.findViewById(R.id.btn_registration);
        registration.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String email = ed_email.getText().toString();
                    String password = ed_password.getText().toString();
                    String repeat_password = ed_repeat_password.getText().toString();
                    String city = ed_city.getText().toString();
                    String phone = ed_phone.getText().toString();
                    User user = new User(email, password, city);
                    if (!isValidEmail(email)) {
                        if (password.equals(repeat_password)) {

                        } else {
                            tv_password.setText("Паролі не співпадають");
                            tv_password.setTextColor(R.color.errorColor);
                            tv_repeat_password.setText("Паролі не співпадають");
                            tv_repeat_password.setTextColor(R.color.errorColor);
                        }
                    } else {
                        tv_email.setText("Не валідний E-mail");
                        tv_email.setTextColor(R.color.errorColor);
                    }
            }
        });
        return v;
    }
}
