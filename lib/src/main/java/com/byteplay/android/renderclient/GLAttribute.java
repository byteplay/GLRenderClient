package com.byteplay.android.renderclient;


public abstract class GLAttribute extends GLVariable {


    GLAttribute(GLRenderClient client, GLProgram program, int id, int type, String name, int length) {
        super(client, program, id, type, name, length);
    }

}
