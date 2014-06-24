package org.ansj.test;

import love.cq.domain.Forest;
import org.ansj.domain.Term;
import org.ansj.library.UserDefineLibrary;
import org.ansj.recognition.NatureRecognition;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.ansj.util.MyStaticValue;
import org.junit.Test;

import java.util.List;

/**
 * Created by xux on 14-4-21.
 */
public class SimpleTest {

    @Test
    public void test1(){
        String str = "她是二舅";
        MyStaticValue.userLibrary="library/userLibrary.dic";
        List<Term> terms =  ToAnalysis.parse(str);
        new NatureRecognition(terms).recognition();
        for(Term term : terms) {
            System.out.println(term.getName()+":"+term.getNatrue().natureStr);
        }
        System.out.println(ToAnalysis.parse(str));
    }



}
