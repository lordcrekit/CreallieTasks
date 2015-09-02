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
import Creallie.Tasks.tasks.CreaTaskFactory;
import Creallie.XML.document.CreaDocument;
import Creallie.XML.document.StandardDocument;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Set;

/**
 * Contains methods for reading and writing tasks to files.
 *
 * @author William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu)
 */
public final class TaskReader {

    /*
     * ================================================ PRIMARY FUNCTIONS ===============================================
     */
    /**
     *
     * @param instream
     * @param factories
     * @return
     * @throws IOException
     */
    public Set<CreaTask> read( InputStream instream, Set<CreaTaskFactory> factories ) throws IOException {
        return read(Creallie.XML.io.Reader.read(new StandardDocument(), instream), factories);
    }

    /**
     *
     * @param reader
     * @param factories
     * @return
     * @throws IOException
     */
    public Set<CreaTask> read( Reader reader, Set<CreaTaskFactory> factories ) throws IOException {
        return read(Creallie.XML.io.Reader.read(new StandardDocument(), reader), factories);
    }

    /**
     *
     * @param file
     * @param factories
     * @return
     * @throws IOException
     */
    public Set<CreaTask> read( File file, Set<CreaTaskFactory> factories ) throws IOException {
        return read(Creallie.XML.io.Reader.read(new StandardDocument(), file), factories);
    }

    /*
     * ================================================ PRIVATE FUNCTIONS ===============================================
     */
    private Set<CreaTask> read( CreaDocument doc, Set<CreaTaskFactory> factories ) {
        return null;
    }
}
