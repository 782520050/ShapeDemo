package wjx.bhne.com.shapedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import wjx.bhne.com.shapedemo.activitys.LineActivity;
import wjx.bhne.com.shapedemo.activitys.OvalActivity;
import wjx.bhne.com.shapedemo.activitys.RectangleActivity;
import wjx.bhne.com.shapedemo.activitys.RingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button rectangle;
    private Button line;
    private Button oval;
    private Button ring;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        /*矩形*/
        rectangle = (Button) findViewById(R.id.bt_rectangle);
        /*线*/
        line = (Button) findViewById(R.id.bt_line);
        /*椭圆*/
        oval = (Button) findViewById(R.id.bt_oval);
        /*环*/
        ring = (Button) findViewById(R.id.bt_ring);
    }


    private void initData() {
        rectangle.setOnClickListener(this);
        line.setOnClickListener(this);
        oval.setOnClickListener(this);
        ring.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bt_line:
                StartActivity(LineActivity.class);
                break;
            case R.id.bt_oval:
                StartActivity(OvalActivity.class);
                break;
            case R.id.bt_rectangle:
                StartActivity(RectangleActivity.class);
                break;
            case R.id.bt_ring:
                StartActivity(RingActivity.class);
                break;
        }
    }

    private void StartActivity(Class cls) {
        intent = new Intent(this, cls);
        startActivity(intent);
    }

}
