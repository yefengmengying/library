# ARG SPARK_IMAGE=gcr.io/spark-operator/spark:v2.4.5

# FROM golang:1.12.5-alpine as builder
# ARG DEP_VERSION="0.5.3"
# RUN apk add --no-cache bash git
# ADD https://github.com/golang/dep/releases/download/v${DEP_VERSION}/dep-linux-amd64 /usr/bin/dep
# RUN chmod +x /usr/bin/dep

# WORKDIR ${GOPATH}/src/github.com/GoogleCloudPlatform/spark-on-k8s-operator
# COPY Gopkg.toml Gopkg.lock ./
# RUN dep ensure -vendor-only
# COPY . ./
# RUN go generate && CGO_ENABLED=0 GOOS=linux go build -o /usr/bin/spark-operator

# FROM ${SPARK_IMAGE}
# COPY --from=builder /usr/bin/spark-operator /usr/bin/
# RUN apt-get update \
#     && apt-get install -y openssl curl tini \
#     && rm -rf /var/lib/apt/lists/*
# COPY gencerts.sh /usr/bin/

# COPY entrypoint.sh /usr/bin/
# ENTRYPOINT ["/usr/bin/entrypoint.sh"]


####################################################


# FROM gcr.io/spark-operator/spark-operator:v1beta2-1.2.0-3.0.0

# FROM gcr.io/spark-operator/spark:v3.0.0

# FROM ghcr.io/spotify/flink-operator:v0.3.5

# FROM gcr.io/kubebuilder/kube-rbac-proxy:v0.8.0

# FROM ghcr.io/banzaicloud/jmx-javaagent:0.16.1

FROM ghcr.io/banzaicloud/kafka:2.13-3.1.0

