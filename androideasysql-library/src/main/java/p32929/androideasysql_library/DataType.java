package p32929.androideasysql_library;

/**
 * Created by p32929 on 7/8/18.
 */

/*
MIT License

Copyright (c) 2018 Fayaz Bin Salam

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class DataType {
    private String type = "";

    // Data Types
    private String TEXT = " TEXT ";
    private String INTEGER = " INTEGER ";

    // constrains
    private String asUnique = " UNIQUE ";
    private String notNull = " NOT NULL ";

    // Data Type setters
    public DataType _text_() {
        type += TEXT;
        return this;
    }

    public DataType _int_() {
        type += INTEGER;
        return this;
    }


    //
    public DataType unique() {
        type += asUnique;
        return this;
    }

    public DataType notNull() {
        type += notNull;
        return this;
    }

    //
    public String done() {
        return type;
    }
}
