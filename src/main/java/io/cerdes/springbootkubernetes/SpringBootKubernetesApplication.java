package io.cerdes.springbootkubernetes;

import io.dekorate.jib.annotation.JibBuild;
import io.dekorate.kubernetes.annotation.Ingress;
import io.dekorate.kubernetes.annotation.KubernetesApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@KubernetesApplication(ingress = @Ingress(expose = true))
@JibBuild(from = "openjdk:21-jdk-slim", group = "docker.io/tnaddhal", dockerBuild = false)
public class SpringBootKubernetesApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootKubernetesApplication.class, args);
    }
}
