package dyamoon.com.github.simplenotes.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import dyamoon.com.github.simplenotes.R
import dyamoon.com.github.simplenotes.utils.APP_ACTIVITY
import kotlinx.android.synthetic.main.fragment_note.*


class NoteFragment : Fragment(R.layout.fragment_note) {

    override fun onStart() {
        super.onStart()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        super.onCreateOptionsMenu(menu, inflater)
        APP_ACTIVITY.menuInflater.inflate(R.menu.note_action_menu, menu)
    }
}