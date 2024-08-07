package com.corejava.Exception;


public class InvalidNameException extends Exception {
            @Override
            public String getMessage() {
            	return"Name Can Not Start With Number Or Special Character";
            }

}
