# Use the official Ubuntu image
FROM ubuntu:latest

# Set the working directory
WORKDIR /app

# Install necessary tools or applications (e.g., for demonstration purposes, install 'curl' and 'nano')
RUN apt-get update && \
    apt-get install -y curl nano && \
    rm -rf /var/lib/apt/lists/*

# Start a shell to keep the container running
CMD ["bash"]