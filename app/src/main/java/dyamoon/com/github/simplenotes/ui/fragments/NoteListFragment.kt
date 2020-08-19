package dyamoon.com.github.simplenotes.ui.fragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dyamoon.com.github.simplenotes.MainActivity
import dyamoon.com.github.simplenotes.R
import dyamoon.com.github.simplenotes.ui.objects.AppDrawer
import kotlinx.android.synthetic.main.fragment_note_list.*



class NoteListFragment() : Fragment(R.layout.fragment_note_list) {


    override fun onStart() {
        super.onStart()
        AppDrawer()
    }


}