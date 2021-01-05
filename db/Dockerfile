FROM mysql:8.0.20

MAINTAINER odin(wangiegie@gmail.com)

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY ./1schema.sql /docker-entrypoint-initdb.d

COPY ./2odin.sql /docker-entrypoint-initdb.d

COPY ./3odin_ac.sql /docker-entrypoint-initdb.d

COPY ./4odin_job.sql /docker-entrypoint-initdb.d

COPY ./5odin_mp.sql /docker-entrypoint-initdb.d

COPY ./6odin_config.sql /docker-entrypoint-initdb.d

COPY ./7odin_pay.sql /docker-entrypoint-initdb.d

COPY ./8odin_codegen.sql /docker-entrypoint-initdb.d