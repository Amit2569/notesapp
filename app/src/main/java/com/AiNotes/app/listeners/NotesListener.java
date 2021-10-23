package com.AiNotes.app.listeners;

import com.AiNotes.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
