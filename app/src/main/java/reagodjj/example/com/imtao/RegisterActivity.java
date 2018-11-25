package reagodjj.example.com.imtao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView tvAgreeAgreement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvAgreeAgreement = findViewById(R.id.tv_agree_agreement);
        setTextColorStyle();
    }

    private void setTextColorStyle() {
        Spannable spannable = new SpannableString(getResources().getString(R.string.agree_agreement));
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.grey, null)),
                0, 7, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.string_blue, null)),
                7, 13, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        tvAgreeAgreement.setText(spannable);
    }
}
