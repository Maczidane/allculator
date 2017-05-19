/*
 * Copyright 2017 Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.duy.calculator.math_eval.test;

import android.os.SystemClock;
import android.util.Log;

import com.example.duy.calculator.math_eval.BigEvaluator;
import com.example.duy.calculator.math_eval.LogicEvaluator;

/**
 * Created by DUy on 18-Jan-17.
 */

public class PerformanceTest {
    private static final String TAG = PerformanceTest.class.getSimpleName();
    private BigEvaluator evaluator;

    public PerformanceTest(BigEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    /**
     * test performance
     */
    public void test() {
//        evaluateWithResultNormal("2+3+2", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("sqrt(2)+sin(3)", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//            }
//        });
//        getResultAsTex("23/23/23.", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("sin(x) + cos(x)", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("2^32+ 23+236^32", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("tan(x) - 2x^2 + 100!", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("{1, 2, 3} + {2, 3, 4}", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("{{1, 2, 3}, {2, 3, 4}} + {{2, 3, 4}, {1, 2, 3}}", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        getResultAsTex("{{1, 2}, {3, 5}} * {{2, 3}, {5,4}}", new Evaluator.EvaluateCallback() {
//            @Override
//            public void onEvaluated(String mExpression, String mResult, int errorResourceId) {
//                d(TAG, "onEvaluated: " + mExpression + " = " + mResult);
//
//            }
//        });
//        d(TAG, "test: begin test hard");
        long start = SystemClock.currentThreadTimeMillis();
        for (int i = 0; i < 100; i++) {
            evaluator.evaluateWithResultNormal(i + "+" + (i / 3) + " * " + "sqrt(" + i + ") * " + i * 2, new LogicEvaluator.EvaluateCallback() {
                @Override
                public void onEvaluated(String expr, String result, int errorResourceId) {
                    Log.d(TAG, "onEvaluated: " + expr + " = " + result);

                }
            });
        }
//        testStepListener("D(Sin(x),x)");
//        testStepListener("Solve(2x^2 + 1 -2 == 0, x)");
//        testStepListener("2x + a - x + 3x + 2 - 2x + 1");
//        testStepListener("Factor(x^4-1)");
//        testStepListener("Limit(x^4-1, x -> 3)");
//        testStepListener("Limit(sqrt(x), x -> 3)");
//        testStepListener("Limit(2/sqrt(x), x -> 3)");
//        testDefineFunction();
        long end = SystemClock.currentThreadTimeMillis();
//        Log.w(TAG, "test: " + (end - start) + " ms");
    }
}
