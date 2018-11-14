package reagodjj.example.com.imtao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import reagodjj.example.com.imtao.fragment.FindFragment;
import reagodjj.example.com.imtao.fragment.MainFragment;
import reagodjj.example.com.imtao.fragment.MineFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected LinearLayout llMainMenu, llFindMenu, llMineMenu;
    protected MainFragment mainFragment = new MainFragment();
    protected FindFragment findFragment = new FindFragment();
    protected MineFragment mineFragment = new MineFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        getSupportFragmentManager().beginTransaction().add(R.id.rl_container_content, mainFragment)
                .add(R.id.rl_container_content, findFragment).hide(findFragment)
                .add(R.id.rl_container_content, mineFragment).hide(mineFragment).commit();
    }

    private void initView() {
        llMainMenu = findViewById(R.id.ll_main_menu);
        llFindMenu = findViewById(R.id.ll_find_menu);
        llMineMenu = findViewById(R.id.ll_mine_menu);

        llMainMenu.setOnClickListener(this);
        llFindMenu.setOnClickListener(this);
        llMineMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_main_menu:
                getSupportFragmentManager().beginTransaction().show(mainFragment).hide(findFragment)
                        .hide(mineFragment).commit();
                break;

            case R.id.ll_find_menu:
                getSupportFragmentManager().beginTransaction().hide(mainFragment).show(findFragment)
                        .hide(mineFragment).commit();
                break;

            case R.id.ll_mine_menu:
                getSupportFragmentManager().beginTransaction().hide(mainFragment).hide(findFragment)
                        .show(mineFragment).commit();
                break;
        }
    }
}
