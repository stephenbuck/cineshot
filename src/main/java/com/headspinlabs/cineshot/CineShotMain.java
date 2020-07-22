package com.headspinlabs.cineshot;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.awt.GLCanvas;

public class CineShotMain {

    public static final String CINESHOT_TITLE   = "CineShot";
    public static final String CINESHOT_VERSION = "1.0";

    public static GLProfile      glp;
    public static GLCapabilities caps;
    public static GLCanvas       canvas;

    public static void main(String args[]) {

        System.out.format("%s %s\n", CINESHOT_TITLE, CINESHOT_VERSION);

        // Initialize OpenGL
        glp    = GLProfile.getDefault();
        caps   = new GLCapabilities(glp);
        canvas = new GLCanvas(caps);

        CineShotWindow window = new CineShotWindow();

        canvas.addGLEventListener( new GLEventListener() {
            
            @Override
            public void display( GLAutoDrawable drawable ) {
            }

            @Override
            public void dispose( GLAutoDrawable drawable ) {
            }

            @Override
            public void init( GLAutoDrawable drawable ) {
            }

            @Override
            public void reshape( GLAutoDrawable drawable, int x, int y, int width, int height ) {
            }

        });

    }
}

