/*
 * The MIT License
 *
 * Copyright 2015 William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Creallie.Tasks.io;

import Creallie.Tasks.tasks.CreaTask;
import Creallie.XML.document.CreaDocument;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Set;

/**
 *
 * @author William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu)
 */
public final class TaskWriter {


    /*
     * ================================================ PRIMARY FUNCTIONS ===============================================
     */
    /**
     *
     * @param outstream
     * @param tasks
     * @throws IOException
     */
    public void write( OutputStream outstream, Set<CreaTask> tasks ) throws IOException {
        Creallie.XML.io.Writer.write(toDoc(tasks), outstream);
    }

    /**
     *
     * @param writer
     * @param tasks
     * @throws IOException
     */
    public void write( Writer writer, Set<CreaTask> tasks ) throws IOException {
        Creallie.XML.io.Writer.write(toDoc(tasks), writer);
    }

    /**
     *
     * @param file
     * @param tasks
     * @throws IOException
     */
    public void write( File file, Set<CreaTask> tasks ) throws IOException {
        Creallie.XML.io.Writer.write(toDoc(tasks), file);
    }

    /*
     * ================================================ PRIVATE FUNCTIONS ===============================================
     */
    private CreaDocument toDoc( Set<CreaTask> tasks ) throws IOException {
        throw new UnsupportedOperationException();
    }
}
