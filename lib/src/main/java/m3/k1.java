package m3;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: b, reason: collision with root package name */
    private static List f25249b;

    /* renamed from: a, reason: collision with root package name */
    private static final Map f25248a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25250c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = f25250c;
        synchronized (obj) {
            Map map = f25248a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    if (f25249b == null) {
                        f25249b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f25249b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap map2 = new HashMap();
                            map2.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            map2.put("profileLevels", arrayList2);
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                            map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                            map2.put("widths", b(videoCapabilities.getSupportedWidths()));
                            map2.put("heights", b(videoCapabilities.getSupportedHeights()));
                            map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            arrayList.add(map2);
                        }
                    }
                    f25248a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e5) {
                HashMap map3 = new HashMap();
                map3.put("error", e5.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f25248a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    private static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
