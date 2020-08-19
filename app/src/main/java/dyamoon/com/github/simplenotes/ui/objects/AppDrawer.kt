package dyamoon.com.github.simplenotes.ui.objects

import androidx.drawerlayout.widget.DrawerLayout
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem
import dyamoon.com.github.simplenotes.R
import dyamoon.com.github.simplenotes.utils.APP_ACTIVITY

class AppDrawer {
    private lateinit var mDrawer: Drawer
    private lateinit var mHeader: AccountHeader
    // private lateinit var mDrawerLayout: DrawerLayout
    //  private lateinit var mCurrentProfile: ProfileDrawerItem


    fun create() {
        initHeader()
        initDrawer()
    }

    private fun initDrawer() {
        mDrawer = DrawerBuilder()
            .withActivity(APP_ACTIVITY)
            .withToolbar(APP_ACTIVITY.mToolbar)
            .withAccountHeader(mHeader)
            .withSelectedItem(-1)
            .addDrawerItems(
                PrimaryDrawerItem()
                    .withIdentifier(1)
                    .withName("Fisrt block"),
                PrimaryDrawerItem()
                    .withIdentifier(2)
                    .withName("Second block")
            )
            .build()
    }

    private fun initHeader() {
        mHeader = AccountHeaderBuilder()
            .withActivity(APP_ACTIVITY)
            .withHeaderBackground(R.drawable.header)
            .build()
    }

}