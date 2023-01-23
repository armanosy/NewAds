package com.kimganteng.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.arman.adspro.AlienGDPR;
import com.arman.adspro.AlienOpenAds;
import com.arman.adspro.AliendroidBanner;
import com.arman.adspro.AliendroidNative;
import com.arman.adspro.AliendroidReward;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlienOpenAds.LoadOpenAds("");
        RelativeLayout layAds = findViewById(R.id.layAds);
        RelativeLayout layNative = findViewById(R.id.layNative);
        AlienGDPR.loadGdpr(this,"APPLOVIN-M",false);
        //AliendroidInitialize.SelectAdsApplovinMax(this,"","85460dcd");
        AliendroidNative.SmallNativeAdmob(this,layNative,"","ca-app-pub-3940256099942544/2247696110",
                "", "","","","","");
        AliendroidBanner.SmallBannerApplovinMax(this,layAds,"","ca-app-pub-3940256099942544/6300978111",
                "");
       // AliendroidNative.MediumNativeMax(this,layNative,"","DefaultBanner","");
      //  AliendroidBanner.SmallBannerApplovinMax(this,layAds,"","Home_Screen","");

        AliendroidReward.LoadRewardApplovinMax(this,"APPLOVIN-D","ca-app-pub-3940256099942544/5224354917","");
       // AliendroidIntertitial.LoadIntertitialApplovinMax(this,"","DefaultInterstitial","");

    }

    public void showreward(View view){

        //AliendroidIntertitial.ShowIntertitialApplovinMax(MainActivity.this,"","DefaultInterstitial","",0);
        AliendroidReward.ShowRewardApplovinMax(MainActivity.this,"APPLOVIN-D","ca-app-pub-3940256099942544/5224354917","");
    }
}