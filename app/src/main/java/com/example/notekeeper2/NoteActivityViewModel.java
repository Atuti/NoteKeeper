package com.example.notekeeper2;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {

    private static final String NOTE_COURSE_ID = "package com.example.notekeeper2.NOTE_COURSE_ID";
    private static final String COURSE_TITLE = "package com.example.notekeeper2.COURSE_TITLE";
    private static final String COURSE_TEXT = "package com.example.notekeeper2.COURSE_TEXT";
    public String mOriginalNoteCourseId;
    public String mOriginalNoteTitle;
    public String mOriginalNoteText;

    public boolean mIsNewlyCreated = true;

    public void saveState (Bundle outState) {
        outState.putString(NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(COURSE_TITLE, mOriginalNoteTitle);
        outState.putString(COURSE_TEXT, mOriginalNoteText);

    }
    public void restoreState (Bundle inState) {
        mOriginalNoteCourseId= inState.getString(NOTE_COURSE_ID);
        mOriginalNoteTitle = inState.getString(COURSE_TITLE);
        mOriginalNoteText = inState.getString(COURSE_TEXT);
    }
}
