-if class com.rana.bitapp.data.entity.JsonResponse
-keepnames class com.rana.bitapp.data.entity.JsonResponse
-if class com.rana.bitapp.data.entity.JsonResponse
-keep class com.rana.bitapp.data.entity.JsonResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
