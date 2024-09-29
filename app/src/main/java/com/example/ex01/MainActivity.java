package com.example.ex01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Khai báo các biến giao diện tại đây
    EditText edtA, edtB, edtKQ;
    Button btncong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ Id cho các biến giao diện
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        btncong = findViewById(R.id.btntong);

        // Xử lý tương tác với người dùng
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(edtA.getText().toString()); // Lấy dữ liệu từ edtA, ép sang kiểu int và gán vào biến a
                    int b = Integer.parseInt(edtB.getText().toString());
                    int c = a + b;
                    edtKQ.setText(String.valueOf(c)); // Hiển thị kết quả
                } catch (NumberFormatException e) {
                    edtKQ.setText("Invalid input"); // Hiển thị thông báo lỗi
                }
            }
        });
    }
}
