package com.example.examen;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    String API_BASE_URL="";
    @GET("/matriculas")
    Call<List<Matricula>> getMatricula();

    @FormUrlEncoded
    @POST("/matriculas")
    Call<ResponseMessage> createMatricula(
            @Field("correo") String nombre,
            @Field("titulo") String solicitud,
            @Field("tipodesolicitud") String detalles);
    @Multipart
    @POST("/productos")
    Call<ResponseMessage> createMatriculaWithImage(
            @Part("nombre") RequestBody nombre,
            @Part("titulo") RequestBody solicitud,
            @Part("detalles") RequestBody detalles,
            @Part MultipartBody.Part imagen
    );
}
