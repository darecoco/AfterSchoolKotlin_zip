package kr.hs.emirim.darecoco.tabhosttest

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("deprecation")
class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("spec1").setIndicator("And One")
        tabSpec1.setContent(R.id.linear1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("spec2").setIndicator("Megupoid GUMI")
        tabSpec2.setContent(R.id.linear2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("spec3").setIndicator("VORA")
        tabSpec3.setContent(R.id.linear3)
        tabHost.addTab(tabSpec3)

        tabHost.currentTab = 1
    }
}