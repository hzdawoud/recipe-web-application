package com.hzdawoud.recipewebapplication.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 6/21/17.
 */
@Getter
@Setter
@NoArgsConstructor
public class NoteCommand {
    private Long id;
    private String recipeNotes;

}
