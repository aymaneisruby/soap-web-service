# soap-web-service
<p align="justify">
Nous allons suivre les étapes pour créer un web service qui permet de convertir un montant de l'euro en dirham marocain, consulter un compte, consulter une liste de comptes, et ensuite déployer le web service à l'aide d'un serveur JaxWS. Nous analyserons également le WSDL avec un navigateur HTTP et testerons les opérations du web service à l'aide d'outils tels que SoapUI ou Oxygen. Enfin, nous créerons des clients SOAP en Java, .NET et PHP, et déploierons le web service dans un projet Spring Boot.</p>

* ## Création du web service:
<p align="justify">
Pour créer le web service, vous pouvez utiliser un langage de programmation comme Java avec JAX-WS (Java API for XML Web Services) ou PHP avec le framework SOAP natif. Vous devrez implémenter les opérations de conversion d'euro en dirham, de consultation de compte et de liste de comptes dans le web service.</p>

* ## Déploiement du web service avec un serveur JaxWS:
<p align="justify">
Une fois que vous avez implémenté le web service, vous pouvez le déployer à l'aide d'un serveur JaxWS tel que Apache Tomcat ou GlassFish. Assurez-vous que le serveur JaxWS est correctement configuré et que le web service est déployé avec succès.</p>

* ## Consultation et analyse du WSDL avec un navigateur HTTP:
<p align="justify">
Le WSDL (Web Services Description Language) est un document XML qui décrit les fonctionnalités du web service. Vous pouvez consulter le WSDL en accédant à l'URL du web service à l'aide d'un navigateur HTTP. Par exemple, si votre web service est accessible à l'adresse http://localhost:8080/monWebService, vous pouvez consulter le WSDL en accédant à l'URL http://localhost:8080/monWebService?wsdl.</p>

* ## Test des opérations du web service avec un outil comme SoapUI ou Oxygen:
<p align="justify">
Vous pouvez utiliser des outils tels que SoapUI ou Oxygen pour tester les opérations du web service. Ces outils vous permettent de spécifier les paramètres d'entrée des opérations et de visualiser les résultats renvoyés par le web service. Vous devrez fournir l'URL du web service et les paramètres requis pour chaque opération que vous souhaitez tester.</p>

* ## Création d'un client SOAP Java:
<p align="justify">
Pour créer un client SOAP en Java, vous pouvez utiliser des bibliothèques telles que JAX-WS ou Apache CXF. Ces bibliothèques vous permettent de générer des classes de proxy à partir du WSDL du web service. Vous pouvez ensuite utiliser ces classes de proxy pour invoquer les opérations du web service à partir de votre client Java.</p>

* ## Création d'un client SOAP .NET:
<p align="justify">
Pour créer un client SOAP en .NET, vous pouvez utiliser Visual Studio et ajouter une référence de service à votre projet. Vous devrez fournir l'URL du web service ou le fichier WSDL correspondant, et Visual Studio générera les classes de proxy nécessaires pour invoquer les opérations du web service à partir de votre client .NET.</p>

* ## Création d'un client SOAP PHP:
<p align="justify">
Pour créer un client SOAP en PHP, vous pouvez utiliser la classe native SoapClient. Vous devrez fournir l'URL du web service ou le fichier WSDL correspondant, et utiliser la classe SoapClient pour invoquer les opérations du web service à partir de votre client PHP.</p>

* ## Déploiement du web service dans un projet Spring Boot:
<p align="justify">
Si vous souhaitez déployer le web service dans un projet Spring Boot, vous pouvez utiliser le module Spring Web Services (Spring-WS). Spring-WS simplifie le développement de web services SOAP en fournissant des fonctionnalités telles que la gestion des requêtes et des réponses SOAP, la validation des messages, etc. Vous devrez configurer votre projet Spring Boot pour utiliser Spring-WS et implémenter les opérations du web service.</p>
<p align="justify">
Une fois que vous avez terminé toutes ces étapes, vous aurez un web service fonctionnel qui peut être utilisé par différents clients SOAP en Java, .NET et PHP.</p>

<img width="590" alt="3" src="https://user-images.githubusercontent.com/105078337/224100499-bd400520-a526-4a50-9a61-ad1c474ac984.png">

<img width="960" alt="24" src="https://user-images.githubusercontent.com/105078337/224100619-c386ea7c-7780-4060-a925-3c99730fb654.png">

<img width="960" alt="27" src="https://user-images.githubusercontent.com/105078337/224100929-f3c515b9-82a2-46cb-9b54-c18a9a61b472.png">

<img width="960" alt="24" src="https://user-images.githubusercontent.com/105078337/224101041-7284e4e3-c829-4191-bfb8-5433e04e5d37.png">

<img width="960" alt="23" src="https://user-images.githubusercontent.com/105078337/224101132-9e9c302c-9c0b-47cb-ab7b-6c95f123de3d.png">

<img width="960" alt="25" src="https://user-images.githubusercontent.com/105078337/224101494-4f2845b1-e4d5-45e9-93b5-0e46e8b0c7eb.png">

<img width="960" alt="26" src="https://user-images.githubusercontent.com/105078337/224101574-7806742b-ed7e-418b-ba94-2375f33e91c8.png">

<img width="512" alt="4" src="https://user-images.githubusercontent.com/105078337/224101657-ad4892ee-f834-4328-a498-1818c7e971f9.png">

<img width="512" alt="5" src="https://user-images.githubusercontent.com/105078337/224101681-e6c6842a-93f6-4dcf-aa40-5130be03e0cf.png">

<img width="960" alt="6" src="https://user-images.githubusercontent.com/105078337/224101717-324d02ae-57e9-491e-9e03-7300e9d650e5.png">

<img width="950" alt="8" src="https://user-images.githubusercontent.com/105078337/224101763-b4924ee1-7d20-4ae8-b2db-08b246a3bd4a.png">

<img width="950" alt="9" src="https://user-images.githubusercontent.com/105078337/224101803-e0066586-c45a-4d30-b589-206ae20e6753.png">

<img width="950" alt="10" src="https://user-images.githubusercontent.com/105078337/224101844-927875f8-b513-4eae-82ba-02968f977d83.png">

<img width="950" alt="11" src="https://user-images.githubusercontent.com/105078337/224101934-3763739e-d574-4d5c-bee6-7200dfe31416.png">

<img width="950" alt="12" src="https://user-images.githubusercontent.com/105078337/224101996-557ddd9d-f223-43a2-9fc3-74908a8c6679.png">

<img width="950" alt="13" src="https://user-images.githubusercontent.com/105078337/224102074-18443909-8c55-4e1c-9770-d1eef55372f2.png">

<img width="950" alt="14" src="https://user-images.githubusercontent.com/105078337/224102115-0760288a-25e0-491e-be4e-07e0e89f7dd6.png">

<img width="950" alt="15" src="https://user-images.githubusercontent.com/105078337/224102170-6b31855d-31cd-4064-b603-563353e26dc9.png">

<img width="950" alt="16" src="https://user-images.githubusercontent.com/105078337/224102247-d0477e7c-b16d-43bd-9b2d-8a5aff7b80b9.png">

# Java Client 

<img width="590" alt="17" src="https://user-images.githubusercontent.com/105078337/224102419-d9ab9429-25bf-4dc1-9e20-0edd27366d1f.png">

<img width="950" alt="18" src="https://user-images.githubusercontent.com/105078337/224102502-23b8ddba-6055-4f25-9a83-79ef32eb98a9.png">

<img width="960" alt="19" src="https://user-images.githubusercontent.com/105078337/224102539-6cb40eba-4b0a-4676-b81b-151bf416eb3a.png">

<img width="960" alt="20" src="https://user-images.githubusercontent.com/105078337/224102600-e75b31d9-495a-475d-8eda-933a37f08d50.png">

<img width="960" alt="21" src="https://user-images.githubusercontent.com/105078337/224102650-3d2374f0-b3ca-4c7d-926a-a570d756ce04.png">

<img width="960" alt="22" src="https://user-images.githubusercontent.com/105078337/224102747-96ff4b4b-08b0-48b0-9ac3-bd4d7d097add.png">

# Dotnet c# console app Client 

<img width="667" alt="3" src="https://user-images.githubusercontent.com/105078337/224176152-181b28a7-95e2-4b07-88df-2c4321065c1c.png">

<img width="667" alt="2" src="https://user-images.githubusercontent.com/105078337/224176184-fc9ec88b-0cbd-4c82-88ac-af9fec6490fe.png">

![4](https://user-images.githubusercontent.com/105078337/224176290-1bb29431-bf4a-4b85-9d3b-7480e89ca8c5.png)

<img width="960" alt="5" src="https://user-images.githubusercontent.com/105078337/224176250-7dc84972-72a8-487d-909d-3f0357778fc9.png">

<img width="960" alt="6" src="https://user-images.githubusercontent.com/105078337/224176345-87d5e5f5-c279-43ff-87b2-5005d803471b.png">

<img width="603" alt="7" src="https://user-images.githubusercontent.com/105078337/224176397-bb5deb28-397c-42c9-9a04-9bbefe107e3f.png">

<img width="603" alt="8" src="https://user-images.githubusercontent.com/105078337/224176413-4a39021a-5f3b-47b7-8e49-d1d5c4c0213d.png">

<img width="603" alt="9" src="https://user-images.githubusercontent.com/105078337/224176425-7f577955-bf23-4e4e-b5e5-1620e5982ddf.png">

<img width="603" alt="10" src="https://user-images.githubusercontent.com/105078337/224176446-dd8eaad4-4568-46f8-8c75-a93c03a5dd0c.png">

<img width="603" alt="17" src="https://user-images.githubusercontent.com/105078337/224176483-b1d03ce3-909b-44fd-a7d0-368ff83be0df.png">

<img width="603" alt="18" src="https://user-images.githubusercontent.com/105078337/224176500-b40fba63-7e18-46bf-8064-3fa42f67aa2c.png">

<img width="603" alt="13" src="https://user-images.githubusercontent.com/105078337/224176535-28d51148-1ae4-4421-ac0f-c74f390f15aa.png">

<img width="603" alt="14" src="https://user-images.githubusercontent.com/105078337/224176585-6190af20-a3f0-44ec-b79e-b53357ca6b0e.png">

<img width="960" alt="19" src="https://user-images.githubusercontent.com/105078337/224176780-060754da-907f-4088-85d3-e787e5ef1bb1.png">

<img width="960" alt="15" src="https://user-images.githubusercontent.com/105078337/224176628-34ab2af4-f0ea-46f2-b86e-3e2d4de1d86d.png">

<img width="674" alt="16" src="https://user-images.githubusercontent.com/105078337/224176647-d25ea2f8-a07e-47dd-a74d-5b634f3e2642.png">

# Dotnet C# Windows Forms application Client 

<img width="667" alt="1" src="https://user-images.githubusercontent.com/105078337/224190685-6686787d-bd90-4967-a4aa-c92e2fc0b103.png">

<img width="960" alt="2" src="https://user-images.githubusercontent.com/105078337/224190696-b8550dde-5ad9-477d-8519-ff7805de3ddf.png">

<img width="960" alt="3" src="https://user-images.githubusercontent.com/105078337/224190745-d3063ab7-731f-4689-acb9-403962f802bc.png">

<img width="440" alt="4" src="https://user-images.githubusercontent.com/105078337/224190765-9608b823-df3f-44ff-918e-6b4516fe4da9.png">

<img width="440" alt="5" src="https://user-images.githubusercontent.com/105078337/224190786-94221d45-b059-456c-96ff-2e2aaf77195c.png">

<img width="960" alt="6" src="https://user-images.githubusercontent.com/105078337/224190856-00e672bb-9eda-478c-a817-66fd4f2928b0.png">

<img width="960" alt="10" src="https://user-images.githubusercontent.com/105078337/224190930-673035b0-845d-4f9a-b989-8b3afd4881c9.png">

<img width="960" alt="11" src="https://user-images.githubusercontent.com/105078337/224191040-cb3232bd-1ca8-42d4-8fce-369c01e56df0.png">

<img width="960" alt="12" src="https://user-images.githubusercontent.com/105078337/224191093-57f6417e-46d4-4373-9ac4-abe2eb3bb036.png">

<img width="960" alt="13" src="https://user-images.githubusercontent.com/105078337/224191111-d2aa2e25-72d7-4286-8c3e-23097be66273.png">

<img width="470" alt="7" src="https://user-images.githubusercontent.com/105078337/224190959-572fceee-cd9d-4086-9ba0-d80985ae6e81.png">

<img width="470" alt="8" src="https://user-images.githubusercontent.com/105078337/224190979-aa90c953-6e3f-4dc5-a47b-3f9cef4a04f1.png">

<img width="470" alt="9" src="https://user-images.githubusercontent.com/105078337/224191008-905fa588-c32c-4890-a765-4f929cddd2cf.png">


# PHP Client 

<img width="960" alt="4" src="https://user-images.githubusercontent.com/105078337/224191260-f81cdb50-9cad-4704-ab01-ff6e008edd18.png">

<img width="960" alt="5" src="https://user-images.githubusercontent.com/105078337/224191287-e0d2f80a-0ae4-4233-882a-bd8feabde136.png">

<img width="960" alt="6" src="https://user-images.githubusercontent.com/105078337/224191304-62cb1d4a-d70a-419c-92df-ea528a65ca11.png">

<img width="960" alt="7" src="https://user-images.githubusercontent.com/105078337/224191324-2f3ec0f8-5bfb-4bc0-8b9a-b9d16669f9b7.png">

<img width="960" alt="8" src="https://user-images.githubusercontent.com/105078337/224191343-b1d905e8-1103-4acc-8359-ba33cf1a0ea0.png">

<img width="512" alt="1" src="https://user-images.githubusercontent.com/105078337/224191199-931fcf31-26cf-4e81-9d44-62c37670c4e7.png">

<img width="512" alt="2" src="https://user-images.githubusercontent.com/105078337/224191220-540d4ad6-63d3-40a2-9705-e02b91848e4c.png">

<img width="512" alt="3" src="https://user-images.githubusercontent.com/105078337/224191238-33f3f715-45fd-4c7b-bb7e-a3cacd16d4d1.png">
