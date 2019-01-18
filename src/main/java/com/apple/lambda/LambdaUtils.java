package com.apple.lambda;

import java.util.function.Predicate;

public class LambdaUtils {
	static Predicate<String> isALongWord = t -> t.length() > 10;
}
