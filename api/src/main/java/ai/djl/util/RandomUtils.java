/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package ai.djl.util;

import java.util.Random;

/** A class that holds a static instance of {@link Random} object. */
public final class RandomUtils {

    public static final Random RANDOM = new Random();

    private RandomUtils() {}

    /**
     * Returns the next pseudorandom, uniformly distributed {@code double} value between {@code 0.0}
     * and {@code 1.0} from this random number generator's sequence.
     *
     * @return a random value between {@code 0.0} and {@code 1.0}
     */
    public static double random() {
        return RANDOM.nextDouble();
    }

    /**
     * Returns the next pseudorandom, Gaussian ("normally") distributed {@code double} value with
     * mean {@code 0.0} and standard deviation {@code 1.0} from this random number generator's
     * sequence.
     *
     * @return a double value with mean {@code 0.0} and standard deviation {@code 1.0}
     */
    public static double nextGaussian() {
        return RANDOM.nextGaussian();
    }

    /**
     * Returns the next pseudorandom, uniformly distributed {@code int} value from this random
     * number generator's sequence.
     *
     * @return an integer value from this random number generator's sequence
     */
    public static int nextInt() {
        return RANDOM.nextInt();
    }

    /**
     * Returns a pseudorandom, uniformly distributed {@code int} value between 0 (inclusive) and the
     * specified value (exclusive), drawn from his random number generator's sequence.
     *
     * @param bound the bounding value
     * @return an integer value between 0 (inclusive) and the specified value (exclusive)
     */
    public static int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }
}
