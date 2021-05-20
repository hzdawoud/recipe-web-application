package com.hzdawoud.recipewebapplication.converter;

import com.hzdawoud.recipewebapplication.command.NoteCommand;
import com.hzdawoud.recipewebapplication.domain.Note;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteCommandToNoteTest {

    public static final Long ID_VALUE = 1L;
    public static final String RECIPE_NOTES = "Notes";
    NoteCommandToNote converter;

    @Before
    public void setUp() throws Exception {
        converter = new NoteCommandToNote();

    }

    @Test
    public void testNullParameter() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new NoteCommand()));
    }

    @Test
    public void convert() throws Exception {
        //given
        NoteCommand notesCommand = new NoteCommand();
        notesCommand.setId(ID_VALUE);
        notesCommand.setRecipeNotes(RECIPE_NOTES);

        //when
        Note notes = converter.convert(notesCommand);

        //then
        assertNotNull(notes);
        assertEquals(ID_VALUE, notes.getId());
        assertEquals(RECIPE_NOTES, notes.getRecipeNotes());
    }

}