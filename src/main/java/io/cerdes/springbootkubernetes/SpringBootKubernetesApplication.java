package io.cerdes.springbootkubernetes;

import io.dekorate.jib.annotation.JibBuild;
import io.dekorate.kubernetes.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@KubernetesApplication(ingress = @Ingress(expose = true, host = "spring-boot-kubernetes.io"), serviceType = ServiceType.NodePort, replicas = 2, ports = @Port(name = "http", containerPort = 8080, protocol = Protocol.HTTP))
@JibBuild(from = "openjdk:21-jdk-slim", group = "docker.io/tnaddhal", dockerBuild = false)
public class SpringBootKubernetesApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootKubernetesApplication.class, args);
    }
}
