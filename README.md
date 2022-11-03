# Learn-docker-kubernetes

- <ins>Build and tag docker image:</ins>  &nbsp; docker build -t java-practice-date .  
- <ins>Run docker image to check if service is running:</ins> &nbsp;docker run -dp 8080:8080 java-practice-date  
- <ins>Install minikube for local k8 cluster:</ins> &nbsp;brew install minikube.  
- <ins>Export basic settings for minikube to work properly:</ins> &nbsp;minikube docker-env and run output export commands or simple eval $(minikube docker-env).   
- <ins>Start minikube:</ins> &nbsp;minikube start.   
- <ins>Enable local nginx server:</ins> &nbsp;minikube addons enable ingress.   
- minikube addons enable ingress-dns.   
- <ins>Check if server is running:</ins> &nbsp;kubectl get pods -n ingress-nginx.   
- <ins>Create deployment:</ins> &nbsp;kubectl apply -f deploy/applyjava-pratice-deployment.yaml.   
- <ins>Create service:</ins> &nbsp;kubectl apply -f deploy/applyjava-pratice-service.yaml (to get service url - minikube service java-practice-srv - url) or.   
- <ins>Create ingress:</ins> &nbsp;kubectl apply -f deploy/applyjava-pratice-ingress.yaml.  
- Tunnel to access host from external source or browser: minikube tunnel.   
- Now access localhost in your browser.   
- k8 dashboard: minikube dashboard to access k8 dashboard.    
