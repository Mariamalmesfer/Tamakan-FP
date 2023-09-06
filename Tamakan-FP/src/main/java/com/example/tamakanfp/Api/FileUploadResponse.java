package com.example.tamakanfp.Api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileUploadResponse {

        private String fileName;
        private String downloadUri;
        private long size;

    }

