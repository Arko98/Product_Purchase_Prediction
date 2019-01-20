# Inroduction
This project predicts the purchase of a bank product using Naive Bayes based on 15 features of 4520 customer records. Some of these 
features are categorical and rest of them ar numrical

# Dataset
The Dataset consists of 4521 individual customer records with 15 different features each. 7 of the features are continious feature and rest of them are numerical. The dataset can be downloaded here: https://drive.google.com/file/d/1sSXE29ASPLdZUT-LKQyGGSizbZ1fIwBd/view?usp=sharing
# Approach
The problem being a binary classification problem I use a naive bayes algorithm which requires the dataset to be divided into two parts.
Subset for the 'Yes' class and Subset for the 'No' class. Then featurewise likelihoods are estimated (Gaussian Distribution for Continious 
features and counting for categorical features. 

# Features
1. Hadoop MapReduce codes are written in java
2. Big Data file handling using HiveQL
3. The Project assumes the dataset to be of Very Large size, so this approach can be equally used for any other big datasets (Petabytes)
4. The Performance tweaking by dropping features is very easy and  can be achieved by a very nominal change in the Probability_Compute_Mapper.
