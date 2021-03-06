package dyamoon.com.github.simplenotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.DrawerBuilder
import dyamoon.com.github.simplenotes.databinding.ActivityMainBinding
import dyamoon.com.github.simplenotes.ui.fragments.NoteFragment
import dyamoon.com.github.simplenotes.ui.fragments.NoteListFragment
import dyamoon.com.github.simplenotes.ui.objects.AppDrawer
import dyamoon.com.github.simplenotes.utils.APP_ACTIVITY

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding : ActivityMainBinding
    lateinit var mToolbar : Toolbar


    override fun onStart() {
        super.onStart()
        AppDrawer().create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        APP_ACTIVITY = this
        initFields()


        APP_ACTIVITY.supportFragmentManager.beginTransaction()
            .add(R.id.data_container, NoteListFragment())
            .commit()

    }

    private fun initFields() {
     mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mToolbar = mBinding.mainToolbar
        setSupportActionBar(mToolbar)
    }


}