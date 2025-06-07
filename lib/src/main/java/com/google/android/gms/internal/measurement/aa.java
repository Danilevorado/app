package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
abstract class aa {
    static String a(y9 y9Var, String str) throws SecurityException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(y9Var, sb2, 0);
        return sb2.toString();
    }

    static final void b(StringBuilder sb2, int i10, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(na.a(x7.u((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof x7) {
            sb2.append(": \"");
            sb2.append(na.a((x7) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof u8) {
            sb2.append(" {");
            d((u8) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        b(sb2, i13, "key", entry.getKey());
        b(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    private static final String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    private static void d(y9 y9Var, StringBuilder sb2, int i10) throws SecurityException {
        Object obj;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : y9Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb2, i10, c(strConcat), u8.k(method2, y9Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb2, i10, c(strConcat2), u8.k(method3, y9Var, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objK = u8.k(method4, y9Var, new Object[0]);
                    if (method5 == null) {
                        if (objK instanceof Boolean) {
                            if (((Boolean) objK).booleanValue()) {
                                b(sb2, i10, c(strConcat3), objK);
                            }
                        } else if (objK instanceof Integer) {
                            if (((Integer) objK).intValue() != 0) {
                                b(sb2, i10, c(strConcat3), objK);
                            }
                        } else if (objK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objK).floatValue()) != 0) {
                                b(sb2, i10, c(strConcat3), objK);
                            }
                        } else if (!(objK instanceof Double)) {
                            if (objK instanceof String) {
                                obj = "";
                            } else if (objK instanceof x7) {
                                obj = x7.f19398n;
                            } else if (objK instanceof y9) {
                                if (objK != ((y9) objK).a()) {
                                    b(sb2, i10, c(strConcat3), objK);
                                }
                            } else if (!(objK instanceof Enum) || ((Enum) objK).ordinal() != 0) {
                                b(sb2, i10, c(strConcat3), objK);
                            }
                            if (!objK.equals(obj)) {
                                b(sb2, i10, c(strConcat3), objK);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) != 0) {
                            b(sb2, i10, c(strConcat3), objK);
                        }
                    } else if (((Boolean) u8.k(method5, y9Var, new Object[0])).booleanValue()) {
                        b(sb2, i10, c(strConcat3), objK);
                    }
                }
            }
        }
        qa qaVar = ((u8) y9Var).zzc;
        if (qaVar != null) {
            qaVar.g(sb2, i10);
        }
    }
}
