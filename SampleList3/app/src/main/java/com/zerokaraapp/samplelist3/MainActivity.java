package com.zerokaraapp.samplelist3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //SimpleAdapter の引数に使用する、データ格納のキーのリスト
    private static final String[] FROM = {"age","work","name"};
    //SimpleAdapter の引数に使用する、データ出力先のIDのリスト
    private static final int[] TO = {R.id.age,R.id.work,R.id.name};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトからリストビューを取得
        ListView profile = findViewById(R.id.list_View);
        //createメソッドを使ってリストを生成
        List<Map<String,Object>> profileList = createProfileList();

        //SimpleAdapterを生成、これでリストの構成を指示する
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,profileList,R.layout.content,FROM,TO);

        //adapterをつかってリストビューにデータを登録
        profile.setAdapter(adapter);
    }

    //リストビューの中に入れるものを生成するメソッド
    private List<Map<String,Object>> createProfileList(){
        //リストインスタンス生成。ここにリストを入れていく
        List<Map<String,Object>> profileList = new ArrayList<>();
        //データを格納するMapインスタンスの用意
        Map<String,Object> profile = new HashMap<>();

        //データの格納開始
        profile.put("age",22);
        profile.put("work","国家公務員");
        profile.put("name","福田 直人");
        profileList.add(profile);
        //下の5行を好きなだけ繰り返してください。
        profile = new HashMap<>();
        profile.put("age",41);
        profile.put("work","俳優");
        profile.put("name","岡田 雄太");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",54);
        profile.put("work","建築家");
        profile.put("name","吉田 健介");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",96);
        profile.put("work","家政婦");
        profile.put("name","高橋 雅史");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",100);
        profile.put("work","建築家");
        profile.put("name","高橋 岳");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",14);
        profile.put("work","用務員");
        profile.put("name","佐藤 理沙");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",67);
        profile.put("work","メイド");
        profile.put("name","鈴木 奈々");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",25);
        profile.put("work","茶道家");
        profile.put("name","木村 理恵");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",45);
        profile.put("work","刑務官");
        profile.put("name","岡 裕子");
        profileList.add(profile);

        profile = new HashMap<>();
        profile.put("age",85);
        profile.put("work","建築家");
        profile.put("name","本田 直美");
        profileList.add(profile);

        //格納したprofileListをリターン
        return profileList;
    }

}