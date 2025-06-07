package r8;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.h;
import s9.c;
import z7.e;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f26669a;

    /* renamed from: b, reason: collision with root package name */
    private final y7.a f26670b;

    public b(c cVar) {
        this.f26669a = cVar;
        this.f26670b = new y7.a(cVar);
    }

    private String a(String str, String str2, String str3, String str4, String str5, Map map) {
        h.v("[InApp]ResourceMapper", "Key: \"" + str3 + "\", Type: \"" + str4 + "\", Default Value: \"" + str5 + "\"");
        if (map.containsKey(str3)) {
            str5 = a.b((String) map.get(str3), str4);
        }
        String strReplace = str.replace(str2, str5);
        h.h("[InApp]ResourceMapper", "Replacing \"" + str2 + "\" with \"" + str5 + "\"");
        return strReplace;
    }

    private String c(String str, Pattern pattern, Map map) {
        Matcher matcher = pattern.matcher(str);
        String strA = str;
        while (matcher.find()) {
            if (matcher.groupCount() == 3) {
                strA = a(strA, matcher.group(0), matcher.group(1), matcher.group(2), matcher.group(3), map);
            } else if (matcher.groupCount() == 2) {
                if (pattern.toString().equals("\\{(.[^\\}]+?)\\|(.[^\\}]+?)\\|\\}")) {
                    strA = a(strA, matcher.group(0), matcher.group(1), matcher.group(2), "", map);
                }
                strA = a(strA, matcher.group(0), matcher.group(1), matcher.group(2), matcher.group(1), map);
            } else {
                h.x("[InApp]ResourceMapper", "Incorrect matching count");
            }
        }
        return strA;
    }

    protected String b(String str, Map map) throws IOException {
        String strH = e.h(this.f26669a.b(str));
        try {
            strH = c(c(c(c(strH, Pattern.compile("\\{\\{(.[^\\}]+?)\\|(.[^\\}]+?)\\|(.[^\\}]*?)\\}\\}", 32), this.f26670b.a(str)), Pattern.compile("\\{\\{(.[^\\}]+?)\\|(.[^\\}]+?)\\|(.[^\\}]*?)\\}\\}"), map), Pattern.compile("\\{\\{(.[^\\}]+?)\\|(.[^\\}]+?)\\}\\}"), this.f26670b.a(str)), Pattern.compile("\\{(.[^\\}]+?)\\|(.[^\\}]+?)\\|\\}"), map);
            return c(strH, Pattern.compile("\\{(.[^\\}]+?)\\|(.[^\\}]+?)\\|(.[^\\}]*?)\\}"), map);
        } catch (Exception e5) {
            h.x("[InApp]ResourceMapper", "Failed to process html: " + e5.getMessage());
            return strH;
        }
    }

    public t8.a d(q9.b bVar) throws IOException {
        return new t8.a(bVar.l(), Uri.fromFile(this.f26669a.d(bVar.l())).toString(), b(bVar.l(), bVar.q()));
    }
}
