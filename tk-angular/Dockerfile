FROM node
USER node
WORKDIR /project
RUN npm install http-server
COPY /dist/tk-angular /project/public
CMD [ "node_modules/.bin/http-server"]