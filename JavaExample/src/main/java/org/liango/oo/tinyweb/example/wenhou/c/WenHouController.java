package org.liango.oo.tinyweb.example.wenhou.c;

import org.liango.oo.tinyweb.HttpRequest;
import org.liango.oo.tinyweb.c.TemplateController;
import org.liango.oo.tinyweb.example.wenhou.Constant;
import org.liango.oo.tinyweb.v.View;

import java.util.*;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 15:25
 */
public class WenHouController extends TemplateController {

    private Random random;

    public WenHouController(View view) {
        super(view);
        random = new Random();
    }

    @Override
    protected Map<String, List<String>> request2Map(HttpRequest httpRequest) {
        Map<String, List<String>> map = new HashMap<>();
        map.put(Constant.WENHOU_MAP_KEY, geterateGreetings(httpRequest.getBody()));
        return map;
    }

    private List<String> geterateGreetings(String body) {
        String[] split = body.split(",");
        List<String> greetings = new ArrayList<>();
        for (String name : split) {
            greetings.add(makeGreeting(name));
        }
        return greetings;
    }

    private String makeGreeting(String name) {
        // 用各国语言翻译“你好”
        String[] greetings = {
                  "世界语        : Saluton                              "
                , "中文          : 你好                                 "
                , "丹麦语        : Goddag                               "
                , "俄罗斯        : привет (privét, informal)      "
                , "克罗地亚语    : Bok                                  "
                , "加泰来语      : hola                                 "
                , "匈牙利语      : Jó napot                             "
                , "南非的荷兰语  :  hallo                               "
                , "印度          : (namasté)                            "
                , "埃及          : مرحبًا (márħaban)                    "
                , "塔加路语      : Kumusta                              "
                , "巴西          : hola, buenos días                    "
                , "希伯来语      : shalom                               "
                , "德国          : hallo, guten Tag                     "
                , "意大利语      : Ciao,或Buongiorno                    "
                , "意第绪语      : （犹太人使用的国际语）sholem aleychem"
                , "捷克语        : Dobrý den, Ahoj                      "
                , "日本          : おはようございます ohayō gozaimásu   "
                , "法国          : salut (informal), bonjour            "
                , "泰国语:       : sa-wat-dee                           "
                , "海地语        : namaste                              "
                , "澳大利亚      : hello                                "
                , "祖鲁语        : sawubona                             "
                , "罗马尼亚语    : salut                                "
                , "英语          : hello                                "
                , "荷兰语        : hoi 或者 hallo                       "
                , "西班牙语      : hola, buenos días                    "
                , "阿拉伯语      : Ahalan                               "
                , "韩语          : a ni yo ha sei yo                    "};

        String greeting = greetings[random.nextInt(greetings.length)] ;

        return String.format("%s, %s", greeting, name);
    }

}
