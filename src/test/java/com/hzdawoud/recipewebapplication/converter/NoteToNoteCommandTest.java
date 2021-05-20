package com.hzdawoud.recipewebapplication.converter;

import com.hzdawoud.recipewebapplication.command.NoteCommand;
import com.hzdawoud.recipewebapplication.domain.Note;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteToNoteCommandTest {

    public static final Long ID_VALUE = 1L;
    public static final String RECIPE_NOTES = "Notes";
    NotesToNotesCommand converter;

    @Before
    public void setUp() throws Exception {
        converter = new NotesToNotesCommand();
    }

    @Test
    public void convert() throws Exception {
        //given
        Note notes = new Note();
        notes.setId(ID_VALUE);
        notes.setRecipeNotes(RECIPE_NOTES);

        //when
        NoteCommand notesCommand = converter.convert(notes);

        //then
        assertEquals(ID_VALUE, notesCommand.getId());
        assertEquals(RECIPE_NOTES, notesCommand.getRecipeNotes());
    }

    @Test
    public void testNull() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new Note()));
    }
}