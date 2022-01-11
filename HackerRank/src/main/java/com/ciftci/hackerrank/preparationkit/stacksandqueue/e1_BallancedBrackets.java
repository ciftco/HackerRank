package com.ciftci.hackerrank.preparationkit.stacksandqueue;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class e1_BallancedBrackets {

    public static void main(String[] args) {


        List<String> strings = Arrays.asList(
                "()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}",
                "{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[",
                "[)](][[([]))[)",
                "]}]){[{{){",
                "{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){[",
                "()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})",
                "){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{",
                "[(})])}{}}]{({[]]]))]})]",
                "[{",
                "{}([{()[]{{}}}])({})",
                "{({}{[({({})([[]])}({}))({})]})}",
                "()[]",
                "{)[])}]){){]}[(({[)[{{[((]{()[]}][([(]}{](])()(}{(]}{})[)))[](){({)][}()((",
                "[][(([{}])){}]{}[()]{([[{[()]({}[])()()}[{}][]]])}",
                "(}]}",
                "(([{()}]))[({[{}{}[]]{}})]{((){}{()}){{}}}{}{{[{[][]([])}[()({}())()({[]}{{[[]]([])}})()]]}}",
                "[(([){[](}){){]]}{}([](([[)}[)})[(()[]){})}}]][({[}])}{(({}}{{{{])({]]}[[{{(}}][{)([)]}}",
                "()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]",
                "({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[",
                ")}(()[])(}]{{{}[)([})]()}()]}(][}{){}}})}({](){([()({{(){{",
                "}([]]][[){}}[[)}[(}(}]{(}[{}][{}](}]}))]{][[}(({(]}[]{[{){{(}}[){[][{[]{[}}[)]}}]{}}(}");


        List<String> results = Arrays.asList("YES",
                "NO",
                "NO",
                "NO",
                "NO",
                "NO",
                "NO",
                "NO",
                "NO",
                "YES",
                "YES",
                "YES",
                "NO",
                "YES",
                "NO",
                "YES",
                "NO",
                "YES",
                "NO",
                "NO",
                "NO");


        //String balanced = isBalanced("{[(])}");

        for (int i = 0; i < strings.size(); i++){
            String item = strings.get(i);
            String result = results.get(i);
            String calculatedResult =  isBalanced(item);
            if(!calculatedResult.equals(result)){
                System.out.println(i);
            }

        }

    }

    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i= 0; i<s.length() ; i++) {
            char aChar = chars[i];
            if (aChar =='{' || aChar =='[' || aChar =='('  ) {
                stack.push(aChar);
            }

            if (aChar =='}' || aChar ==']' || aChar ==')'  ) {
                if(stack.isEmpty())
                    return "NO";

                char popedCharacter = stack.pop();
                if(popedCharacter == '{'  && aChar != '}') {
                    return "NO";
                }

                if(popedCharacter == '['  && aChar!= ']') {
                    return "NO";
                }

                if(popedCharacter == '('  && aChar != ')') {
                    return "NO";
                }
            }
        }

        if(!stack.isEmpty()){
            return "NO";
        }


        return "YES";
    }
}
