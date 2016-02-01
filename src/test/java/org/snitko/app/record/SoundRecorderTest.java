package org.snitko.app.record;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;

/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) [2015] [vadim]
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class SoundRecorderTest {

    @Test
    public void testRecord() throws Exception {
        SoundRecorder recorder = new SoundRecorder();
        // path of the wav file
        File wavFile = FileUtils.getFile(FileUtils.getUserDirectory(), "foo.wav");
        System.out.println("File Path: " + wavFile.getAbsolutePath());
        // start recording
        recorder.record(wavFile, 4);
    }
}